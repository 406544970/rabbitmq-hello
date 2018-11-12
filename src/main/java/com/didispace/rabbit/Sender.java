package com.didispace.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author flyman
 * @create 2018/11/25.
 *
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

}