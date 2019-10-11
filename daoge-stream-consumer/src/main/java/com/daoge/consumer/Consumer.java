package com.daoge.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
	@Value("${server.port}")
	private String serverPort;

	@StreamListener("my_stream_channel")
	public void redMsg(String msg) {
		System.out.println("消费者获取到生产者投递的消息:" + msg + ",端口号:" + serverPort);
	}

}
