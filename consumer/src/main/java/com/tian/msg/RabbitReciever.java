package com.tian.msg;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * @author Mloong
 * @version 0.0.1
 * <p></p>
 * @since 2020/6/11
 **/
@Service
@Slf4j
public class RabbitReciever {

    @RabbitListener(bindings = {
            @QueueBinding(
                    value = @Queue(value = "${order.receive.routingkey}"),
                    exchange = @Exchange(value = "${order.receive.exchange}", type = ExchangeTypes.DIRECT)
            )
    })
    public void receive(String msg) {
        log.info("receive: {}", msg);
    }
}
