package hello.vo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Configuration
public class Configurations {
	@Autowired
	private MoveItConfig moveItConfig;
	@Autowired
	private ServiceConfig serviceConfig;
	@Autowired
	private UrlConfigs urlConfigs;
}
