package com.tanz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Itest {
	public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://kjfw.zbj.com");
        driver.manage().window().maximize(); //设置浏览器最大化
        Thread.sleep(3000); //睡眠3s

        driver.navigate().refresh();//刷新页面
        
        driver.findElement(By.id("jrdataget")).click();
        driver.findElement(By.className("jrlj-djan")).click();
        Thread.sleep(3000);       
//        driver.findElement(By.xpath("/html/body/div[4]/div[5]/div/ul/li[1]")).click();
        
        String title = driver.getTitle();
        System.out.println("title:"+title);

        driver.close();
    }
}
