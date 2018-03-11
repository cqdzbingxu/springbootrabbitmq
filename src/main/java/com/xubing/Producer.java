package com.xubing;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by xubing on 2018/3/10.
 */
@Component
public class Producer {

    @Autowired
   public AmqpTemplate amqpTemplate;


    public  void sendMessage(String queueName,String message ){
        amqpTemplate.convertAndSend(queueName,message);
    }

}
