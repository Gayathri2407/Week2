package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreatAccountSelectClass {

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
		c.findElement(By.id("accountName")).sendKeys("Gayathridevi");
		c.findElement(By.className("inputBox")).sendKeys("Selenium Automation Tester");
		WebElement dropDown = c.findElement(By.name("industryEnumId"));
		Select options = new Select(dropDown);
		options.selectByIndex(3);
		WebElement dropDown1= c.findElement(By.name("ownershipEnumId"));
		Select options1= new Select(dropDown1);
		options1.selectByVisibleText("S-Corporation");
		WebElement dropDown2= c.findElement(By.id("dataSourceId"));
		Select options2= new Select(dropDown2);
		options2.selectByValue("LEAD_EMPLOYEE");
		WebElement dropDown3= c.findElement(By.id("marketingCampaignId"));
		Select options3= new Select(dropDown3);
		options3.selectByIndex(6); 
		 WebElement dropDown4 = c.findElement(By.id("generalStateProvinceGeoId"));
		 Select options4= new Select(dropDown4);
			options4.selectByValue("TX"); 
			c.findElement(By.className("smallSubmit")).click();
			String title = c.getTitle();
			System.out.println(title);
			
			
			//c.close();
			
		
	}

}
