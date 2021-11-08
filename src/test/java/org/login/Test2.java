package org.login;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {
	
	@AfterTest
	private void tc21() {
		System.out.println("after test");
	}
	
	@AfterClass
	private void tc22() {
		System.out.println("after class");
	}
	
	@BeforeMethod
	private void tc23() {
		System.out.println("before method");
	}
	
	@Test
	private void tc24() {
		System.out.println("test2-@test2-test2");
	}
	
	@AfterMethod
	private void tc25() {
		System.out.println("after method");
	}
	
	@BeforeClass
	private void tc26() {
		System.out.println("before class");
	}
}