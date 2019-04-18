package hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hello.vo.Configurations;
import hello.vo.MoveItConfig;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
	
	@RestController
	class ServiceInstanceRestController {

		@Autowired
		private DiscoveryClient discoveryClient;

		@RequestMapping("/service-instances/{applicationName}")
		public List<ServiceInstance> serviceInstancesByApplicationName(
				@PathVariable String applicationName) {
			return this.discoveryClient.getInstances(applicationName);
		}
	}
}

//@RefreshScope
//@RestController
//class MessageRestController {
//
//	@Value("${messageOne:hello DefaultOne}")
//	private String messageOne;
//	@Value("${messageTwo:hello DefaultTwo}")
//	private String messageTwo;
//
//	@Autowired
//	private Configurations configurations;
//	@Autowired
//	private MoveItConfig moveItConfig;
//
//	@RequestMapping("/messages")
//	String getMessage() {
//		Configurations configs = new Configurations();
//		configs.setMoveItConfig(moveItConfig);
//		configurations.setMoveItConfig(moveItConfig);
//		return configs.getMoveItConfig().getDestination();
//	}
//
//	//    @RequestMapping("/messages")
//	//    Configurations getMessage() {
//	//        Message message = new Message();
//	//    	message.setMessageOne(messageOne);
//	//    	message.setMessageTwo(messageTwo);
//	//        return message;
//	//    }
//}