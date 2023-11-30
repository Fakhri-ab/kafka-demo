package com.fakhri.kafka.consumer;

import com.fakhri.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

// classe qui nous permet de consommer les msgs depuis le serveur kafka

@Service
@Slf4j
public class KafkaConsumer {

    // @KafkaListener(topics = "Fakhri", groupId = "myGroup")
    public void consumeMsg(String msg) {
        log.info(format("Consuming the message from Fakhri Topic:: %s", msg));
    }

    @KafkaListener(topics = "Fakhri", groupId = "myGroup")
    public void consumeJsonMsg(Student student) {
        log.info(format("Consuming the message from Fakhri Topic:: %s", student.toString()));
    }
}
