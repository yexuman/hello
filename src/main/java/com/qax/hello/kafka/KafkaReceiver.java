package com.qax.hello.kafka;

/**
 * @author yexuman
 * @date 2019/11/1 17:44
 */

import java.util.Optional;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaReceiver {

    private static Logger logger = LoggerFactory.getLogger(KafkaReceiver.class);


    @KafkaListener(topics = {"test"}, containerFactory = "kafkaListenerContainerFactory")
    public void listen(ConsumerRecord<?, ?> record) {
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {
            Object o = kafkaMessage.get();
            logger.info("-------消费到了记录---------- record =" + record);
            logger.info("-------消息内容----------- message =" + o);
        }

    }


}
