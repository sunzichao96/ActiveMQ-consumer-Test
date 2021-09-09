package com.example.activemqconsumer.consumer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class QueueConsumer {

    @JmsListener(destination = "StringQueueTest", containerFactory = "jmsListenerContainerQueue")
    public void receiveStringQueue(String msg) {
        log.info("接收到消息..." + msg);
    }

    @JmsListener(destination = "StringQueueListTest", containerFactory = "jmsListenerContainerQueue")
    public void receiveStringListQueue(List<String> msg) {
        log.info("接收到消息..." + msg);
    }

    @JmsListener(destination = "ObjectQueueTest", containerFactory = "jmsListenerContainerQueue")
    public void receiveObjectQueue(String msg) {
        log.info("接收到消息..." + msg);
    }
}
