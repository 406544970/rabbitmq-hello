package com.didispace.rabbit;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 梁昊
 * @date 2018/11/8
 * @function rabbitMQ配置
 * @editLog
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue helloQueue() {
        return new Queue("kaiJia");
    }

}
