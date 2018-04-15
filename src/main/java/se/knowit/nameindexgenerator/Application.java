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
	private NameIndex nameIndex;

	@RequestMapping(value = "/name-index", method = RequestMethod.GET)
	public String generateNameIndex(@RequestParam String name) {
		return nameIndex.generateNameIndex(name);
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
