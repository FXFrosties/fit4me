package ch.fit4me.springbootfit4me;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SpringbootFit4meApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFit4meApplication.class, args);
	}

}
