package com.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CommonFunctions extends StaticVariables {
	
	public void ClickByxpath(String LocaterName) 
	{
		driver.findElement(By.xpath(LocaterName)).click();
	}
	
	public void EnterTextByid(String LocaterName,String Inputdata) 
	{
		driver.findElement(By.id(LocaterName)).sendKeys(Inputdata);
	}
	
	public  void ClickByID(String Locatername)
	{
		driver.findElement(By.id(Locatername)).click();

	}

	public void Linktext(String Locatername)
	{
		driver.findElement(By.linkText(Locatername)).click();
	}
	
	public void Qantity_dropdown(String LocaterName,String Inputdata)
	{
		new Select(driver.findElement(By.id(LocaterName))).selectByVisibleText(Inputdata);
	}
	
	public void Checkbox(String LocaterName)
	{
		driver.findElement(By.id(LocaterName)).isSelected();
	}
	
	
	}	
