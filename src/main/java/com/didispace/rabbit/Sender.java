package com.didispace.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author 梁昊
 * @date 2018/11/8
 * @function rabbitMQ发送端
 * @editLog
 */
@Component
public class Sender {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void send() {
		String context = "kaiJia_MQ: " + new Date();
		System.out.println("Sender : " + context);
		this.rabbitTemplate.convertAndSend("kaiJia", context);
	}
	public void sendJiaKai(){
		String context = "JiaKai_MQ: from lianghao in " + new Date();
		System.out.println("Sender to JiaKai: " + context);
		this.rabbitTemplate.convertAndSend("JiaKai", context);
	}
}