package com.deliveryagent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static com.deliveryagent.config.AppConstants.LOCATION_TOPIC_NAME;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    public boolean updateLocation(String location) {
        kafkaTemplate.send(LOCATION_TOPIC_NAME, location);
        return true;
    }
}
