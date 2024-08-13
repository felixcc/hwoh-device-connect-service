package com.hwoh.device.connect

/**
 * @author felixchen wrote on 2024-08-12 22:19
 * @version 1.0
 * @description:
 */
class Constant {

    companion object {
        /**
         * errorCode
         */
        const val ERROR_CODE_COMM_FAIL: Int = 206
        const val ERROR_CODE_COMM_SUCCESS: Int = 207

        /**
         * CAPABILITY
         */
        const val DEVICE_CAPABILITY_SUPPORT: Int = 0
        const val DEVICE_CAPABILITY_NOT_SUPPORT: Int = 1
        const val DEVICE_CAPABILITY_UNKNOWN: Int = 2
    }

}