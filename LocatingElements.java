package com.syntax.class02;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[]args) throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https:facebook.com");
        driver.findElement(By.id("email")).sendKeys("syntax654@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("password");
        driver.findElement(By.name("login")).click();
        Thread.sleep(4000);
        //driver.findElement(By.linkText("Forgot password?")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();
        driver.quit();
    }
}
