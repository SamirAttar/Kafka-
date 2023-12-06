package com.endUser.config;

import com.endUser.constance.AppConstance;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfigration {

    @KafkaListener(topics = AppConstance.LOCATION_UPDATE_TOPIC,groupId = AppConstance.GROUO_ID)
    public void updatedLocation(String value){
         System.out.println(value);
    }

}
