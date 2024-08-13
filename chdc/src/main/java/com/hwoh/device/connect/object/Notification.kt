package com.hwoh.device.connect.`object`

import com.hwoh.device.connect.callback.Action

/**
 * @author felixchen wrote on 2024-08-12 22:45
 * @version 1.0
 * @description:
 */
class Notification {

    /**
     * 获取通知的反馈动作。
     */
    lateinit var action: Action

    /**
     * 获取通知按钮内容列表。
     */
    lateinit var buttonContents: MutableMap<Int, String>

    /**
     * 获取通知的应用包名。
     */
    var packageName: String = ""

    /**
     * 获取通知模板的ID。
     */
    var templateId: Int = 0

    /**
     * 获取通知内容。
     */
    var text: String = ""

    /**
     * 获取通知标题。
     */
    var title: String = ""
}