package Spring.kafkaSample;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class Consumer 
{
	public static void main(String[] args) {
		SpringApplication.run(Consumer.class, args);
	}
	@KafkaListener(id = "fooGroup", topics = "helloTopic")
	public void listen(String message) {
		System.out.println(message);
	}
	
	@Bean
	public NewTopic topic() {
		return new NewTopic("helloTopic", 1, (short) 1);
	}
	
	
}
