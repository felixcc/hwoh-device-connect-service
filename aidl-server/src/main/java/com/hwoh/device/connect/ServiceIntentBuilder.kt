package com.hwoh.device.connect

import android.content.Intent


/**
 * @author felixchen wrote on 2024-08-15 12:11
 * @version 1.0
 * @description:
 */
object ServiceIntentBuilder {

    fun buildDeviceConnectBindIntent(): Intent {
        return Intent("com.hwoh.device.connect.DeviceConnectService")
            .setPackage("com.hwoh.device.connect")
    }
}