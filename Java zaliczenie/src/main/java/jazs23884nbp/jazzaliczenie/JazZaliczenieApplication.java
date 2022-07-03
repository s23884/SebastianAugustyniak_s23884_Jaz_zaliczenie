package jazs23884nbp.jazzaliczenie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JazZaliczenieApplication {

 		@Bean
		public ExampleNonSpringClass exampleNonSpringClass() {
			 return new ExampleNonSpringClass();
		}


	public static void main(String[] args) {SpringApplication.run(JazZaliczenieApplication.class, args);
	}

}
