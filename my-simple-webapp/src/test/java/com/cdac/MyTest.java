package com.cdac;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest {

	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/my-simple-webapp/");
		String expected = "Welcome to my website!";
		String actual = driver.findElement(By.tagName("h1")).getText();
		assertEquals(expected, actual);
		driver.close();
	}

}
