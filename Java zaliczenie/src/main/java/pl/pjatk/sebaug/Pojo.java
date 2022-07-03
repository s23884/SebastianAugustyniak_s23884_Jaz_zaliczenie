package pl.pjatk.sebaug;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Pojo {

    @Bean
   public PojoTwo exampleNonSpringClass(@Value("${my.custom.property:}") String s) {
        return new PojoTwo(s);
    }

    @Bean
    public List<String> defultData() {
        return List.of("Some string");
    }
    @Bean
    @ConditionalOnProperty(prefix = "zmienna1", name = "value")
    public PojoTwo example(@Value("${my.custom.property:}") String s) {
        return new PojoTwo(s);
    }
}
