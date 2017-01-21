package com.testcase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.objects.Locaters;
import com.utilities.CommonFunctions;
import com.utilities.StaticVariables;

public class Login extends StaticVariables {
	
	static Locaters obj = new Locaters();
	
	static CommonFunctions cfn = new CommonFunctions();

	public static void main(String[] args) throws IOException, Exception {
		
		FileInputStream testdata = new FileInputStream("C:\\Users\\gpr-shivyog\\workspace\\Amazon_Maven_Project\\Testdata\\Input.properties");
		Properties pro = new Properties();
		pro.load(testdata);
		
		String path = "C:\\Users\\gpr-shivyog\\workspace\\Maven_Project\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		
		driver.get(pro.getProperty("Amazon_URL"));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		cfn.ClickByxpath(obj.xpath_signin);
		
		cfn.EnterTextByid(obj.ID_Email, pro.getProperty("Email"));
		cfn.EnterTextByid(obj.ID_Password, pro.getProperty("Password"));
		Thread.sleep(3000);
		cfn.ClickByxpath(obj.xpath_Sign);
		
		cfn.EnterTextByid(obj.ID_search, pro.getProperty("Search"));
		cfn.ClickByxpath(obj.xpath_searchbutton);
		//cfn.ClickByxpath(obj.xpath_Checkbox);
		cfn.Linktext(obj.text);
		
		cfn.Qantity_dropdown(obj.ID_quantity, pro.getProperty("Quantity"));
		cfn.ClickByID(obj.ID_basket);
		cfn.ClickByID(obj.ID_proceedtocheckout);
		cfn.Linktext(obj.deliver_text);
		cfn.Linktext(obj.changeordelete_text);
		Thread.sleep(2000);
		cfn.Linktext(obj.delete_text);
		//driver.findElement(By.xpath(obj.xpath_signout)).click();
		//cfn.ClickByxpath(obj.xpath_signout);
		WebElement ele = driver.findElement(By.xpath(".//*[@id='nav-item-signout']/span"));
		ele.click();

	}

}
