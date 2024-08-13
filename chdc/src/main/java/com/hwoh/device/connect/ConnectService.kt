package com.hwoh.device.connect

import com.hwoh.device.connect.callback.CancelFileTransferCallBack
import com.hwoh.device.connect.callback.PingCallback
import com.hwoh.device.connect.callback.Receiver
import com.hwoh.device.connect.callback.SendCallback
import com.hwoh.device.connect.client.DeviceClient
import com.hwoh.device.connect.client.NotifyClient
import com.hwoh.device.connect.client.P2pClient
import com.hwoh.device.connect.`object`.Device
import com.hwoh.device.connect.`object`.Message
import com.hwoh.device.connect.`object`.Notification
import com.hwoh.device.connect.`object`.Peer

/**
 * @author :felixchen
 * since:12 Aug 2024 13:40
 * version:1.0
 * Useful:
 */

class ConnectService {

    private val deviceClient: DeviceClient = DeviceClient()
    private val notifyClient: NotifyClient = NotifyClient()
    private val p2pClient: P2pClient = P2pClient()

    companion object {
        fun getInstance(channel: String): ConnectService {
            val instance: ConnectService by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
                ConnectService()
            }
            // 存储channel
            return instance
        }
    }

    // device
    /**
     * 获取已经和App配对的具有应用间消息通信能力的设备列表。
     *
     * 应该本地存储，从mysql里获取
     */
    fun getBondedDevices(): List<Device> {

        return deviceClient.getBondedDevices()
    }

    // notify
    /**
     * 发送一条通知到指定设备。
     */
    fun notify(device: Device, notification: Notification) {

        notifyClient.notify(device, notification)
    }

    //p2p
    /**
     * 检测需要通信的穿戴设备侧应用是否在线。
     */
    fun ping(device: Device, pingCallback: PingCallback) {

        p2pClient.ping(device, pingCallback)
    }

    /**
     * 通过设备信息对象来向指定的设备上的指定应用注册一个接收消息或文件的回调对象。
     */
    fun registerReceiver(peer: Peer, receiver: Receiver) {

        p2pClient.registerReceiver(peer, receiver)
    }

    /**
     *  通过设备信息对象来向需要通信的穿戴设备侧应用发送通信消息。
     */
    fun send(peer: Peer, message: Message, sendCallback: SendCallback) {

        p2pClient.send(peer, message, sendCallback)
    }

    /**
     * 注销一个已经被注册的监测对象。
     */
    fun unregisterReceiver(receiver: Receiver) {

        p2pClient.unregisterReceiver(receiver)
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

        p2pClient.cancelFileTransfer(receiver, peer, message, cancelFileTransferCallBack)
    }
}