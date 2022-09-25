package br.com.levelup.programa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(" ")
public class ProgramaApplication {

	@GetMapping
	public String conect(){return "Connection working, api online";}

	public static void main(String[] args) {
		SpringApplication.run(ProgramaApplication.class, args);
	}

}
