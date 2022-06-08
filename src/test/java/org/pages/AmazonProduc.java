package org.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class AmazonProduc extends BaseClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
	
	browserLaunch("chrome");
	url("https://www.amazon.in/");
	implicitlywait(50);
	maximize();
	WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	searchBox.sendKeys("iphone"+Keys.ENTER);
	Thread.sleep(5000);
	
	List<String> li=new ArrayList<String>();
	List<String> lis=new ArrayList<String>();
	List<String> list=new ArrayList<String>();
	List<Integer> list1=new ArrayList<>();
	
	List<WebElement> elements = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
	System.out.println("Iphone Models");
	for(WebElement x:elements) {
		String text = x.getText();
		System.out.println(text);
		li.add(text);
	}
	List<WebElement> elements1 = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	System.out.println("Iphone Prices");
	for(WebElement x:elements1) {
		String text = x.getText();
		System.out.println(text);		
		lis.add(text);	
	}
	for(String x:lis) {
		if(x.contains(",")) {
			list.add(x.replace(",", ""));
		}
	}
	for(String x:list) {
		int l=Integer.parseInt(x);
		list1.add(l);
	}
	Collections.sort(list1);
	System.out.println("Iphone Prices in Ascending Order");
	for(Integer x:list1) {
		System.out.println(x);
	}
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
