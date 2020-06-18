package com.tian.service.provider;

import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Mloong
 * @version 0.0.1
 * <p></p>
 * @since 2020/6/11
 **/
@Configuration
public class RabbitConfig {
    /*@Value("${order.receive.exchange}")
    private String exchange;

    @Value("${order.receive.routingkey}")
    private String routingKey;

    @Bean
    RabbitTemplate rabbitTemplate() {
        RabbitTemplate rabbitTemplate = new RabbitTemplate();
        rabbitTemplate.setExchange(exchange);
        rabbitTemplate.setRoutingKey(routingKey);
        return rabbitTemplate;
    }

    ConnectionFactory connectionFactory() {
        ConnectionFactory
    }*/
}
