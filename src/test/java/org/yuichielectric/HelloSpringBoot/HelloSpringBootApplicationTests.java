package org.yuichielectric.HelloSpringBoot;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloSpringBootApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
    public void failTest() {
	    // Fail intentionally.
	    fail();
    }

}
