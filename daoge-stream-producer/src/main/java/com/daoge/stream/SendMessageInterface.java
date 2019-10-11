package com.daoge.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

// 创建  发送消息通道
public interface SendMessageInterface {

	// 1.创建发送消息通道
	@Output("my_stream_channel")
	SubscribableChannel sendMsg();
}
