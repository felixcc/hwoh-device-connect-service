package com.hwoh.device.connect.`object`

import com.hwoh.device.connect.Constant

/**
 * @author felixchen wrote on 2024-08-12 21:50
 * @version 1.0
 * @description:
 */
class Device {

    fun a() {
        Constant.ERROR_CODE_COMM_FAIL
    }

    /**
     * 获取设备型号。
     */
    var model: String = ""

    /**
     * 获取设备名称。
     */
    var name: String = ""

    /**
     * 获取保留字段的值。
     */
    var reservedness: String = ""

    /**
     * 获取穿戴设备版本号。
     */
    var softwareVersion: String = ""

    /**
     * 判断设备是否连接（true：已连接；false：未连接）。
     */
    var connected: Boolean = false

    /**
     * 获取产品类型（0：穿戴类产品）。
     */
    var productType: Int = 0

    /**
     * 获取是否支持应用间消息通信能力。
     */
    var p2pCapability: Int = 0

    /**
     * 获取是否支持穿戴模板化通知能力。
     */
    var notifyCapability: Int = 0

    /**
     * 获取是否支持穿戴设备传感器获取能力。
     */
    var sensorCapability: Int = 0

    /**
     * 获取设备类型。(-1:未知； 0：运动手表；)
     */
    var deviceType: Int = 0
}