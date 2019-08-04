package Spring.kafkaSample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/")
public class Producer {
	@Autowired
	private KafkaTemplate<Object, Object> template;
	@PostMapping(path = "/sayHello/{message}")
	public void sendFoo(@PathVariable String message) {
		Test test=new Test(message);
		this.template.send("helloTopic", test.toString());
	}
}
