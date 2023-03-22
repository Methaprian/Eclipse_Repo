package com.trello.testingbytestng;

import org.testng.annotations.Test;

public class KGF {
	@Test(priority = 1)
	public void adheeraTest() {
		System.out.println("adheera");
	}
	@Test(priority = 4)
	public void ramikaSenTest() {
		System.out.println("ramikaSen");
	}
	@Test(priority = 2,groups = "IntegrationTesting, FumctionalityTesting")
	public void garudaTest() {
		System.out.println("garuda");
	}
	@Test(priority = 6,dependsOnMethods = {"garudaTest","adheeraTest","rajendraDesaiTest"}, invocationCount = 3 )
	public void rockyTest() {
		System.out.println("rocky");
	}
	@Test(priority = 3)
	public void suryavardhanTest() {
		System.out.println("suryavardhan");
	}
	@Test(priority = 8)
	public void mumbaiShettyTest() {
		System.out.println("mumbaiShetty");
	}
	@Test(priority = 7)
	public void vanaramTest() {
		System.out.println("Vanaram");
	}
	@Test(priority = 5)
	public void rajendraDesaiTest() {
		System.out.println("rajendraDesai");
	}
}