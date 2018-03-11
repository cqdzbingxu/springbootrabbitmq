package com.xubing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProducerTests {

	@Autowired
	Producer producer;

	@Test
	public void testSend(){
		String queueName="helloworld";
		String message="你好呀";
		producer.sendMessage(queueName,message);
	}




}
