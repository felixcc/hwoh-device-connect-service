package com.hwoh.device.connect.`object`

/**
 * @author felixchen wrote on 2024-08-12 22:27
 * @version 1.0
 * @description:需要通信的设备应用对象。
 *
 * 设备应用对象包含：设备对象、指纹信息、包名
 */
class Peer {

    /**
     * 获取Peer设备对象。
     */
    lateinit var device: Device

    /**
     * 获取Peer指纹信息。
     */
    var fingerPrint: String = ""

    /**
     * 获取Peer包名。
     */
    var pkgName: String = ""

}