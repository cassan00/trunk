package pkg.cm.spkswm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;

// 2020.11.04 SpringSecurity 설정을 읽어오지 않도록 설정
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class SpkswmApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpkswmApplication.class, args);
	}

	@RequestMapping("/")
	public String hello() {
		return "";
	}

	@RequestMapping("/test")
	public String testing() {
		System.out.println("[----------]");
		return "TEST";
	}


}
