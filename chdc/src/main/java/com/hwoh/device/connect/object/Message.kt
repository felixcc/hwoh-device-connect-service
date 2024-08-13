package com.hwoh.device.connect.`object`

import java.io.File

/**
 * @author felixchen wrote on 2024-08-12 22:22
 * @version 1.0
 * @description: 与设备侧通信的Message对象
 */
class Message {

    /**
     * 获取Message数据。
     */
    var data: ByteArray = ByteArray(0)

    /**
     * 获取Message描述。
     */
    var description: String = ""

    /**
     *  获取Message文件。
     */
    lateinit var file: File

    /**
     * 获取Message类型。
     */
    var type: Int = 0
}