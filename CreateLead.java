package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver c = new ChromeDriver();
		c.get("http://leaftaps.com/opentaps/.");
		c.manage().window().maximize();
		c.findElement(By.id("username")).sendKeys("demosalesmanager");
		c.findElement(By.id("password")).sendKeys("crmsfa");
		c.findElement(By.className("decorativeSubmit")).click();
		c.findElement(By.partialLinkText("CRM/SFA")).click();
		c.findElement(By.linkText("Leads")).click();
		c.findElement(By.linkText("Create Lead")).click();
		c.findElement(By.id("createLeadForm_firstName")).sendKeys("Gayathri"); 
		c.findElement(By.id("createLeadForm_lastName")).sendKeys("N");
		c.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		c.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Lead");
		c.findElement(By.name("submitButton")).click();
		String title = c.getTitle();
		System.out.println(title);
	 c.close();
	
	}
	

}
