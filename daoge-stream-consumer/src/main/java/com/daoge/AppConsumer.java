package com.daoge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

import com.daoge.stream.RedMsgInterface;

// 消费者
@SpringBootApplication
@EnableBinding(RedMsgInterface.class)
public class AppConsumer {

	public static void main(String[] args) {
		SpringApplication.run(AppConsumer.class, args);
	}
	// 消费者队列 底层自动创建一个队列 绑定my_stream_channel
}
