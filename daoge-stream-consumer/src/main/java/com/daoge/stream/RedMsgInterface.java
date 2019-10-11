package com.daoge.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface RedMsgInterface {
	@Input("my_stream_channel")
	SubscribableChannel redMsg();
}
