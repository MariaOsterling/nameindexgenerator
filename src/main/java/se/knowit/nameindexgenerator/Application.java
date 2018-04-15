package se.knowit.nameindexgenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@Autowired
	private MegaDanceController megaDanceController;

	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public String hello(@RequestParam String name) {
		return "Hello " + megaDanceController.generateNameIndex(name);
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
