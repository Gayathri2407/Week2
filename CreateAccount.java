package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {

		ChromeDriver c = new ChromeDriver();
		c.get("http://leaftaps.com/opentaps/.");
		c.manage().window().maximize();
		c.findElement(By.id("username")).sendKeys("demosalesmanager");
		c.findElement(By.id("password")).sendKeys("crmsfa");
		c.findElement(By.className("decorativeSubmit")).click();
		c.findElement(By.partialLinkText("CRM/SFA")).click();
		c.findElement(By.linkText("Accounts")).click();
		c.findElement(By.linkText("Create Account")).click(); 
		c.findElement(By.id("accountName")).sendKeys("Gayathri");
		c.findElement(By.className("inputBox")).sendKeys("Selenium Automation Tester");
		c.findElement(By.id("numberEmployees")).sendKeys("2");
		c.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		c.findElement(By.className("smallSubmit")).click();
		String title = c.getTitle();
		System.out.println(title);
		c.close();
	}
	
}
