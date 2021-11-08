package org.login;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test4 {
	
	@AfterTest
	private void tc42() {
		System.out.println("after test");
	}
	
	@AfterClass
	private void tc43() {
		System.out.println("after class");
	}
	
	@AfterMethod
	private void tc44() {
		System.out.println("after method");
	}
	
	@Test
	private void tc45() {
		System.out.println("test");
	}
	
	@AfterMethod
	private void tc46() {
		System.out.println("after method");
	}
	
	@AfterClass
	private void tc47() {
		System.out.println("after class");
	}
	
	@AfterSuite
	private void tc48() {
		System.out.println("after suite");
	}

}
