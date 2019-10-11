package com.daoge.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daoge.stream.SendMessageInterface;

@RestController
public class SendMsgController {

	@Autowired
	private SendMessageInterface sendMessageInterface;
	// 生产者流程:
	// 1.创建发送消息通道

	// 2.生产投递消息（生产者往通道中发送消息）
	@RequestMapping("/sendMsg")
	public String sendMsg() {
		String msg = UUID.randomUUID().toString();
		System.out.println("生产者发送内容msg:" + msg);
		Message build = MessageBuilder.withPayload(msg.getBytes()).build();
		sendMessageInterface.sendMsg().send(build);
		return "success";

	}
	// 3.开启绑定（结合）

}
