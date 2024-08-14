package com.felix

import android.content.ComponentName
import android.content.ServiceConnection
import android.os.IBinder
import com.hwoh.device.connect.service.IDeviceConnectAidlInterface

/**
 * @author felixchen wrote on 2024-08-14 21:00
 * @version 1.0
 * @description:
 */
class DeviceServiceConnection : ServiceConnection {

    private lateinit var d: IDeviceConnectAidlInterface
    override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
        d = IDeviceConnectAidlInterface.Stub.asInterface(service)
    }

    override fun onServiceDisconnected(name: ComponentName?) {
    }

    fun getService(): IDeviceConnectAidlInterface {
        return d
    }
}