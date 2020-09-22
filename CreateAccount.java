package week2.Day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {
	
	public static void main(String[] args) throws InterruptedException {
		
		/* Setup the driver to enable the Selenium to communicate with the chrome browser */
		WebDriverManager.chromedriver().setup();
		
		/* Create an instance for the class ChromeDriver
		 * This launches the Chrome browser automatically */
		 
		ChromeDriver driver = new ChromeDriver();
		
		/* Maximise the Chrome browser */
		driver.manage().window().maximize();
		
		/* launch the URL */
		driver.navigate().to("http://leaftaps.com/opentaps/control/login");
		
		/* Enter the Username using Xpath locator */
		driver.findElementByXPath("//input").sendKeys("demosalesmanager");
		
		/* Enter the password using Collection based Xpath locator */
		driver.findElementByXPath("(//input)[2]").sendKeys("crmsfa");
		
		
		/* Click on Login button using the Xpath- Attribute based */
		driver.findElementByXPath("//input[@class ='decorativeSubmit']").click();
		
		
		/* Get the Current URL of the navigated page */
		String URL = driver.getCurrentUrl();
		
		System.out.println("The current URL on clicking the Submit button is " +URL);
		
		/* Click on CRM/SFA Link using partial Xpath text() */
		driver.findElementByXPath("//a[contains(text() ,'CRM/SFA')]").click();
		
		/* Click on Accounts button using text Xpath */
		driver.findElementByXPath("//a[text() = 'Accounts']").click();
		
		Thread.sleep(1500);
		
				
		/*click on Create account using collection based Xpath */
		driver.findElementByXPath("(//a[contains(text(),'Create Account')]").click();
		
		

	    /* Enter the account name */
		driver.findElementByXPath("//input[@class='inputBox' and @name = 'accountName']").sendKeys("Debit Limited Account");
		
		
		/*Enter DEscriptiion as "Selenium Automation Tester" */
		driver.findElementByXPath("//textarea[@name = 'description']").sendKeys("Selenium Automation Tester");
		
		
		
		/* Enter LocalName Field Using Xpath Locator */
		driver.findElementByXPath("//input[@id = 'groupNameLocal']").sendKeys("Tester");
		
		
		/* Enter SiteName Field Using Xpath Locator */
		driver.findElementByXPath("//input[@id = 'officeSiteName']").sendKeys("TestLeaf");
		
		
		/* Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute */
		driver.findElementById("//input[@class = 'inputBox' and @id ='annualRevenue']").sendKeys("1000");
		
		
		/* Select Industry as ComputerSoftware */
		
			/* Identify the web element Industry */
		       WebElement Industry = driver.findElementById("Select Industry as ComputerSoftware");
		       
		       /* Create an object for Select class and pass the webelement Industry */
		       
		       Select indus = new Select(Industry);
		       
		       /*The value Computer Software is opted using select by visible text method */
		       indus.selectByVisibleText("Computer Software");
		       
		       
	     
	    /*Select OwnerShip as S-Corporation using SelectByVisibletext */
		       
		       /* Identify the web element Ownership */
		       WebElement Ownership = driver.findElementById("ownershipEnumId");
		       
		       /* Create an object for Select class and pass the webelement Industry */
		       
		       Select owner = new Select(Ownership);
		       
		       /*The value S-Corporation is opted using select by visible text method */
		       owner.selectByVisibleText("S-Corporation");
		       
		       
         /*Select Source as Employee using SelectByValue */
		       
		       /* Identify the web element Source */
		       WebElement source = driver.findElementById("dataSourceId");
		       
		       /* Create an object for Select class and pass the webelement source */
		       
		       Select src = new Select(source);
		       
		       /*The value Employee is opted using select by value method */
		       src.selectByValue("LEAD_EMPLOYEE");
		       
		       
		 /* Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex */
		       
		       /* Identify the web element Marketing Campaign */
		       WebElement mktcampaign = driver.findElementById("marketingCampaignId");
		       
		       /* Create an object for Select class and pass the webelement mktcampaign */
		       
		       Select mktcmp = new Select(mktcampaign);
		       
		      /* collect all the options available in the select box Marketing Campaign */
		       List<WebElement> marketingcampaign = mktcmp.getOptions();
		       
		       
		       /* count the length */
		       
		       int count = marketingcampaign.size();
		       
		       /*select eCommerce Site Internal Campaign */
		       mktcmp.selectByIndex(count-3);	
		       
		       
		       
		/*  Select State/Province as Texas using SelectByValue */
		       
		       /* Identify the web element Source */
		       WebElement country = driver.findElementById("generalStateProvinceGeoId");
		       
		       /* Create an object for Select class and pass the webelement Country */
		       Select cntry = new Select(country);
		       
		       /*The value Employee is opted using select by value method */
		       cntry.selectByValue("TX");
		       
		       
		       /* Click on Create Account */
		       driver.findElementByXPath("//input[contains(@onclick ,'submitFormWithSingleClick')]").click();
		       
		       
		      
		       
		       
		       
		       
		       
		       
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
