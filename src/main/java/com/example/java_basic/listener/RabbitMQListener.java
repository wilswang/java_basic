package com.example.java_basic.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class RabbitMQListener {
    private static final String queueName = "test.Queue";
    private static final String queueNameA = "test.Queue.A";
    private static final String queueNameB = "test.Queue.B";
    private static final String queueNameC = "test.Queue.C";
    private static final String queueNameD = "test.Queue.D";
    private static final String queueNameE = "test.Queue.E";
    private static final String exchangeName = "test.exchange";
    private static final String exchangeType = "topic";
    private static final String EXCHANGE_TYPE_DIRECT = "direct";

//    @RabbitListener(queues = queueName)
//    public void listenerWithoutExchangeA(Message message) {
//        log.info("listenerWithoutExchangeA Message:{}", new String(message.getBody()));
//    }
//
//    @RabbitListener(queues = queueName)
//    public void listenerWithoutExchangeB(Message message) {
//        log.info("listenerWithoutExchangeB Message:{}", new String(message.getBody()));
//    }
//
//    @RabbitListener(queues = queueName)
//    public void listenerWithoutExchangeC(Message message) {
//        log.info("listenerWithoutExchangeC Message:{}", new String(message.getBody()));
//    }

    @RabbitListener(bindings = @QueueBinding(value = @Queue(value = queueNameA, durable = "false"),
            exchange = @Exchange(value = exchangeName, durable = "false", type = EXCHANGE_TYPE_DIRECT, ignoreDeclarationExceptions = "false")
            , key = "springboot.A.*"))
    public void listenerA(Message message) {
        log.info("A Message:{}", new String(message.getBody()));
    }

//    @RabbitListener(bindings = @QueueBinding(value = @Queue(value = queueNameB, durable = "true"),
//            exchange = @Exchange(value = exchangeName, durable = "true", type = exchangeType, ignoreDeclarationExceptions = "false")
//            , key = "springboot.*.A"))
//    public void listenerB(Message message) {
//        log.info("B Message:{}", new String(message.getBody()));
//    }
//
//    @RabbitListener(bindings = @QueueBinding(value = @Queue(value = queueNameC, durable = "true"), exchange = @Exchange(value = exchangeName, durable = "true", type = exchangeType, ignoreDeclarationExceptions = "false")
//            , key = "springboot.B.A"))
//    public void listenerC(Message message) {
//        log.info("C Message:{}", new String(message.getBody()));
//    }
//
//    @RabbitListener(bindings = @QueueBinding(value = @Queue(value = queueNameD, durable = "true"),
//            exchange = @Exchange(value = exchangeName, durable = "true", type = exchangeType, ignoreDeclarationExceptions = "false")
//            , key = "springboot.*.*"))
//    public void listenerD(Message message) {
//        log.info("D Message:{}", new String(message.getBody()));
//    }
//
//    @RabbitListener(bindings = @QueueBinding(value = @Queue(value = queueNameE, durable = "true"),
//            exchange = @Exchange(value = exchangeName, durable = "true", type = EXCHANGE_TYPE_DIRECT, ignoreDeclarationExceptions = "false")
//            , key = "springboot.C.A"))
//    public void listenerE(Message message) {
//        log.info("E Message:{}", new String(message.getBody()));
//    }
}
