package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver cd = new ChromeDriver();	
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 cd.get("https://www.facebook.com/");
		 cd.manage().window().maximize();
		 cd.findElement(By.partialLinkText("Create new account")).click();
		 cd.findElement(By.name("firstname")).sendKeys("Gayathri");
		 cd.findElement(By.name("lastname")).sendKeys("N");
		 WebElement birthday = cd.findElement(By.name("birthday_day"));
		 Select options = new Select(birthday);
		 options.selectByIndex(23);
		 WebElement birthdayMonth = cd.findElement(By.name("birthday_month"));
		 Select optionsMonth = new Select(birthdayMonth);
		 optionsMonth.selectByIndex(6);
		 WebElement birthdayYear = cd.findElement(By.name("birthday_year"));
		 Select optionsYear = new Select(birthdayYear);
		 optionsYear.selectByIndex(30);
		// cd.findElement(By.linkText("Female")).click();
		 cd.findElement(By.name("reg_email__")).sendKeys("ggayusairam@gmail.com"); 
		 cd.findElement(By.name("reg_passwd__")).sendKeys("ggayusairam");
		 
	}

}
