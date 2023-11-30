package com.fakhri.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
// classe qui nous permet de creer un topic pour stocker les msgs
@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic FakhriTopic() {
        return TopicBuilder
                .name("Fakhri")
               // .partitions(5)
               // .replicas(3)
                .build();
    }
}
