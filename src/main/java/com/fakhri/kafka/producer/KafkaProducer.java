package com.fakhri.kafka.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

// classe qui nous permet d'envoyer des msgs au topic dans le serveur kafka
@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String msg) {
        log.info(format("Sending message to Fakhri Topic:: %s", msg));
        kafkaTemplate.send("Fakhri", msg);
    }
}
