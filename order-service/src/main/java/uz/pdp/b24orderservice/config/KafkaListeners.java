package uz.pdp.b24orderservice.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "inventory_service", groupId = "groupId")
    void listener(String data){
        System.out.println(data);
    }

}
