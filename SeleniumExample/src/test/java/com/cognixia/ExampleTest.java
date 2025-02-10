package com.cognixia;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class ExampleTest {

	WebDriver driver;
	
	@BeforeEach
	void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	}
	
	@Test
	void testTitle() {

		String title = driver.getTitle(); 
		assertEquals(title, "Web form");
		
	}
	
	@Test
	void testMessage() {
		
		WebElement textBox = driver.findElement(By.name("my-text"));
		WebElement submitButton = driver.findElement(By.cssSelector("button"));
		
		textBox.sendKeys("Hello World");
		submitButton.click();
		
		WebElement message = driver.findElement(By.id("message"));
		
		String messageText = message.getText();
		
		assertEquals("Received!", messageText);
		
	}
	
	@AfterEach
	void teardown() {
		driver.quit();
	}

}
