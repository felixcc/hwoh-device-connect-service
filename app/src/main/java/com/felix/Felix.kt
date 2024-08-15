package com.felix

import android.app.Activity
import android.content.ComponentName
import android.content.ServiceConnection
import android.os.Bundle
import android.os.IBinder
import android.util.Log
import android.view.View
import android.widget.Toast
import com.hwoh.device.connect.ServiceIntentBuilder
import com.hwoh.device.connect.service.IDeviceConnectAidlInterface
import com.hwoh.device.connect.service.R


/**
 * @author felixchen wrote on 2024-08-12 19:36
 * @version 1.0
 * @description:
 */
class Felix : Activity() {

    private var mService: IDeviceConnectAidlInterface? = null
    private var mConnection: ServiceConnection? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bind()
    }

    private fun bind() {
        mConnection = object : ServiceConnection {
            override fun onServiceConnected(
                className: ComponentName,
                service: IBinder
            ) {
                mService = IDeviceConnectAidlInterface.Stub.asInterface(service)
                Toast.makeText(
                    this@Felix, "remote_service_connected",
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onServiceDisconnected(className: ComponentName) {
                mService = null
                Toast.makeText(
                    this@Felix, "remote_service_disconnected",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        val bindingRequestedSuccessfully = bindService(
            ServiceIntentBuilder.buildDeviceConnectBindIntent(),
            mConnection!!,
            BIND_AUTO_CREATE
        )
        Log.d("felix", "bindService:${bindingRequestedSuccessfully}")
    }

    fun onSayHelloClick(view: View?) {
        mService?.apply {
            runCatching {
                sayHello()
            }.onSuccess {
                Toast.makeText(this@Felix, "onSuccess", Toast.LENGTH_SHORT).show()
            }.onFailure {
                Toast.makeText(this@Felix, "onFailure", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun onAddClick(view: View?) {
        mService?.apply {
            runCatching {
                val result = add(1, 2)
                Toast.makeText(this@Felix, "1 + 2 = $result", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        unbindService(mConnection!!)
    }
}
