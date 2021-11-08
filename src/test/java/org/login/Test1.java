package org.login;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	@BeforeSuite
	private void tc1() {
		System.out.println("@beforsuite");
	}
	
	@AfterClass
	private void tc2() {
		System.out.println("after class");
	}
	
	@BeforeMethod
	private void tc3() {
		System.out.println("before method");
	}
	
	@Test
	private void tc4(){
		System.out.println("test1-@test-test1");
	}
	
	@AfterMethod
	private void tc5() {
		System.out.println("after method");
	}
	
	@BeforeClass
	private void tc6() {
		System.out.println("before class");
	}
	
	@BeforeTest
	private void tc7() {
		System.out.println("before test");
	}
}
