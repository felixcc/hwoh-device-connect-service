package com.hwoh.device.connect.client

import com.hwoh.device.connect.callback.CancelFileTransferCallBack
import com.hwoh.device.connect.callback.PingCallback
import com.hwoh.device.connect.callback.Receiver
import com.hwoh.device.connect.callback.SendCallback
import com.hwoh.device.connect.`object`.Device
import com.hwoh.device.connect.`object`.Message
import com.hwoh.device.connect.`object`.Peer

/**
 * @author felixchen wrote on 2024-08-12 22:15
 * @version 1.0
 * @description:
 */
class P2pClient {

    /**
     * 检测需要通信的穿戴设备侧应用是否在线。
     */
    fun ping(device: Device, pingCallback: PingCallback) {

    }

    /**
     * 通过设备信息对象来向指定的设备上的指定应用注册一个接收消息或文件的回调对象。
     */
    fun registerReceiver(peer: Peer, receiver: Receiver) {

    }

    /**
     *  通过设备信息对象来向需要通信的穿戴设备侧应用发送通信消息。
     */
    fun send(peer: Peer, message: Message, sendCallback: SendCallback) {

    }

    /**
     * 注销一个已经被注册的监测对象。
     */
    fun unregisterReceiver(receiver: Receiver) {

    }

    /**
     * 通过设备信息对象来向需要通信的穿戴设备取消文件发送。
     */
    fun cancelFileTransfer(
        receiver: Receiver,
        peer: Peer,
        message: Message,
        cancelFileTransferCallBack: CancelFileTransferCallBack
    ) {

    }
}