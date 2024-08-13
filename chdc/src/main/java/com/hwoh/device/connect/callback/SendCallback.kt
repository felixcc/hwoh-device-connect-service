package com.hwoh.device.connect.callback

/**
 * @author felixchen wrote on 2024-08-12 22:42
 * @version 1.0
 * @description: 发送消息的回调接口
 */
class SendCallback {

    /**
     * 发送消息的进度回调函数。
     */
    fun onSendProgress(count: Long) {

    }

    /**
     * 发送消息的结果回调函数。
     */
    fun onSendResult(errCode: Int) {

    }
}