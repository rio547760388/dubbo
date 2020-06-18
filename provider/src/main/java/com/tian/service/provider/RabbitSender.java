package com.tian.service.provider;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Mloong
 * @version 0.0.1
 * <p></p>
 * @since 2020/6/11
 **/
@Service
public class RabbitSender {

    @Value("${order.receive.exchange}")
    private String exchage;

    @Value("${order.receive.routingkey}")
    private String routingKey;

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void orderComing(Long id) {
        rabbitTemplate.convertAndSend(exchage, null, id + " ----- " + LocalDateTime.now().format(dateTimeFormatter));
    }
}
