package com.hwoh.device.connect.client

import com.hwoh.device.connect.`object`.Device

/**
 * @author felixchen wrote on 2024-08-12 22:10
 * @version 1.0
 * @description:
 */
class DeviceClient {

    /**
     * 获取已经和App配对的具有应用间消息通信能力的设备列表。
     *
     * 应该本地存储，从mysql里获取
     */
    fun getBondedDevices(): List<Device> {
        return listOf()
    }
}