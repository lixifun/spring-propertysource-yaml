package c.n.d.c.config;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class MyConfigTest {

    @Resource
    private MyConfig myConfig;

    @Test
    void propertySourceUseDefault() {

        log.info("MY_PROP: [{}]", myConfig);

        assertEquals("lixi", myConfig.getName());
        assertEquals(8, myConfig.getAge());
    }
}
