package c.n.d.c.config;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class MyYamlConfigTest {

    @Resource
    private MyYamlConfig myYamlConfig;

    @Test
    void propertySourceUseYamlPropertySourceFactory() {

        log.info("MY_YML: [{}]", myYamlConfig.toString());

        assertEquals("lixifun", myYamlConfig.getName());
        assertEquals(88, myYamlConfig.getAge());
    }
}
