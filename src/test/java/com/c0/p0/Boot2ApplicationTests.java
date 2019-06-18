package com.c0.p0;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Boot2ApplicationTests {

	@SuppressWarnings("deprecation")
	@Test
	public void contextLoads() {
		Assert.assertEquals(1, 1);
	}

}
