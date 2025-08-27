package br.ufac.sgcmapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SgcmapiApplication {

	public static void main(String[] args) {
		System.out.println("teste");
		System.out.println("teste2");
		System.out.println("teste3");
		System.out.println("teste4");
		SpringApplication.run(SgcmapiApplication.class, args);
	}

}
