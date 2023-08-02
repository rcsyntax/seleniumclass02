package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {
    public static void main(String[]args){

        System.setProperty("WebDriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https:facebook.com");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        String expectedTitle = "Facebook - log in or sign up";
        if(title.equals(expectedTitle)){
            System.out.println("title is correct");
        }else{
            System.out.println("title is not correct");
        }
        driver.quit();
    }
}
