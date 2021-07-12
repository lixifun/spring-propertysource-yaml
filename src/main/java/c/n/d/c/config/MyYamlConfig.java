package c.n.d.c.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@ConfigurationProperties(prefix = "myy")
@PropertySource(value = "classpath:my.yml", factory = YamlPropertySourceFactory.class)
public class MyYamlConfig {

    private String name;
    private Integer age;

}
