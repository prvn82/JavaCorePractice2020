package com.qa.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	
	@Test
	public void Sum() {
		int a=10;
		int b = 199;
		Assert.assertEquals(209, a+b);
	}
	
	@Test
	public void Sub() {
		int a=10;
		int b = 199;
		Assert.assertEquals(-189, a-b);
	}
	
	@Test
	public void multiply() {
		int a=10;
		int b = 199;
		Assert.assertEquals(1990, a*b);
	}
	
	@Test
	public void Div() {
		int a=10;
		int b = 199;
		Assert.assertEquals(10, a%b);
	}

}
