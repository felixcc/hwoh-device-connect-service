package com.hwoh.device.connect

/**
 * @author felixchen wrote on 2024-08-14 20:24
 * @version 1.0
 * @description:
 */
import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class DeviceConnectService : Service() {

    // Binder implementation
    private val binder = object : IDeviceConnectAidlInterface.Stub() {
        override fun sayHello() {
            Log.d("DeviceConnectService", "Hello from service!")
        }

        override fun add(a: Int, b: Int): Int {
            return a + b
        }
    }

    override fun onBind(intent: Intent?): IBinder {
        return binder
    }
}