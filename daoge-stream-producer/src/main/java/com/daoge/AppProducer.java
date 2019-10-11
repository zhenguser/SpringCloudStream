package com.daoge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

import com.daoge.stream.SendMessageInterface;

@SpringBootApplication
@EnableBinding(SendMessageInterface.class) //绑定通道
public class AppProducer {

	public static void main(String[] args) {
		SpringApplication.run(AppProducer.class, args);
	}
	// 思考： 在rabbit 有交换机 队列
	// 默认以通道名称 创建交换机，消费者启动的时候 随机创建一个队列名称
}
