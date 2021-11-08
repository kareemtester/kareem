package org.login;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {
	@AfterClass
	private void tc32() {
		System.out.println("after class");
	}
	
	@BeforeMethod
	private void tc33() {
		System.out.println("before method");
	}

	@Test
	private void tc34() {
		System.out.println("test3-@test-test3");
	}
	
	@AfterMethod
	private void tc35() {
		System.out.println("after method");
	}
	
	@BeforeClass
	private void tc36() {
		System.out.println("before class");
	}
	
	@BeforeTest
	private void tc37() {
		System.out.println("Before test");
	}
	
}
