package com.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class countATest {

	@Test
	public void test() {
		JunitTesting test=new JunitTesting();
		int output=test.countA("javabean");
		assertEquals(3,output);
	}

}
