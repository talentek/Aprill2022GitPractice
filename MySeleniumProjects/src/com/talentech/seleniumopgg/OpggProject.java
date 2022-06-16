package com.talentech.seleniumopgg;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;



public class OpggProject {

	

	public static void main(String[] args) throws InterruptedException {

		

		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		driver.get("https://na.op.gg/");

		driver.manage().window().maximize();

		

		WebElement searchSummoner = driver.findElement(By.xpath("//*[@id=\"searchSummoner\"]"));

		WebElement ggButton = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/form/button"));

		

		searchSummoner.sendKeys("COOKIEMONSTER123");

		ggButton.click();

	}

	



}


	

