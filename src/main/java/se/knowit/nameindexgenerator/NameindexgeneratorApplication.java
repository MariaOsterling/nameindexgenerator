package se.knowit.nameindexgenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NameindexgeneratorApplication {

	@RequestMapping(value = "/greeting",method= RequestMethod.GET)
	public String hello() {
		return "Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(NameindexgeneratorApplication.class, args);
	}
}
