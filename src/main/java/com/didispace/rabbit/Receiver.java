package com.didispace.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author 梁昊
 * @date 2018/11/8
 * @function rabbitMQ接收端
 * @editLog
 */
@Component
@RabbitListener(queues = "kaiJia")
public class Receiver {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver : " + hello);
    }

}
