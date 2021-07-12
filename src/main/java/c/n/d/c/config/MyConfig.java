package c.n.d.c.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@ConfigurationProperties(prefix = "myp")
@PropertySource(value = "classpath:my.properties")
public class MyConfig {

    private String name;
    private Integer age;
}
