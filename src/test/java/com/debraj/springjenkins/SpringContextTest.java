package com.debraj.springjenkins;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringJenkinsApplication.class})
@DirtiesContext
public class SpringContextTest {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions(){


    }
}
