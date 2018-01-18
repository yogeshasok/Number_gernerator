package com.example;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

	@Test
	public void testLengthOfTheUniqueKey() {
		//added line for commit
		App obj = new App();
		Assert.assertEquals(36, obj.generateUniqueKey().length());

	}
}
