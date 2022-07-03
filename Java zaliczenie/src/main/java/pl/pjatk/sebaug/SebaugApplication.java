package pl.pjatk.sebaug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource("classpath:beans.xml")
public class SebaugApplication {

	public static void main(String[] args) {
		SpringApplication.run(SebaugApplication.class, args);
	}

}
