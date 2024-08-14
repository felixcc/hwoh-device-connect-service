package com.felix

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.RemoteException
import android.view.View
import android.widget.Toast
import com.hwoh.device.connect.service.IDeviceConnectAidlInterface
import com.hwoh.device.connect.service.R


/**
 * @author felixchen wrote on 2024-08-12 19:36
 * @version 1.0
 * @description:
 */
class Felix : Activity() {

    private var mConnection: DeviceServiceConnection? = null
    private val mService: IDeviceConnectAidlInterface? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mConnection = DeviceServiceConnection()
        bindService(Intent(this, IDeviceConnectAidlInterface::class.java), mConnection!!, BIND_AUTO_CREATE)
    }

    fun onSayHelloClick(view: View?) {
        if (mService != null) {
            try {
                mService.sayHello()
            } catch (e: RemoteException) {
                e.printStackTrace()
            }
        }
    }

    fun onAddClick(view: View?) {
        if (mService != null) {
            try {
                val result = mService.add(1, 2)
                Toast.makeText(this, "1 + 2 = $result", Toast.LENGTH_SHORT).show()
            } catch (e: RemoteException) {
                e.printStackTrace()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        unbindService(mConnection!!)
    }
}
