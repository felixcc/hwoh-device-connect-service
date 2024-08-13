package com.hwoh.device.connect.callback

import com.hwoh.device.connect.`object`.Notification

/**
 * @author felixchen wrote on 2024-08-12 22:46
 * @version 1.0
 * @description: 通知反馈的回调，反馈用户在穿戴侧收到通知后的行为
 */
class Action {

    /**
     *  通知异常反馈。
     */
    fun onError(notification: Notification, errorCode: Int, errorMsg: String) {

    }

    /**
     *  通知反馈。
     *  0：物理HOME键退出或者灭屏；
     *  1：删除消息
     *  2：用户点击第一个按钮；
     *  3：用户点击第二个按钮；
     *  4：用户点击第三个按钮
     */
    fun onResult(notification: Notification, feedback: Int) {

    }
}