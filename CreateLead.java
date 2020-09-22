package week2.Day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	
	public static void main(String[] args) {
		
		/* To setup the driver*/
		WebDriverManager.chromedriver().setup();
		
		
		/* Code to open the chrome browser */
		ChromeDriver driver = new ChromeDriver();
		
		
		/* Code to maximize the Chrome browser */
		driver.manage().window().maximize();
		
		/* code to launch the url using get method */
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		
		/* Enter the Username through Search by ID */
		driver.findElementById("username").sendKeys("demosalesmanager");
		
		/* Enter the Password through Search by ID */
		driver.findElementById("password").sendKeys("crmsfa");
		
		
		/* Click on Login button using Class name */
		driver.findElementByClassName("decorativeSubmit").click();
		
		/* Click on CRM link using link text location*/
		driver.findElementByLinkText("CRM/SFA").click();
		
		/* Click on Leads button through linktext */
		driver.findElementByLinkText("Leads").click();
		
		/* Click on Create Lead button using Xpath */
		driver.findElementByPartialLinkText("Create").click();
		
		
		/* Enter the Company name by ID locater */
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		
		/* Enter the first name by ID locator */
		driver.findElementById("createLeadForm_firstName").sendKeys("Vignesh");
		
		/* Enter the Last name by ID locator */
		driver.findElementById("createLeadForm_lastName").sendKeys("Saravanan");
		
		
		/* To invoke the dropdown, a class named "select" needs to be called
		 * 
		 *    The dropdown field is identified using the ID locator and saved in the variable.
		 *    This variable should be passed as a parameter into the select object */
	
		// Source Dropdown
				/* Identify the Source dropdown field */
				WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		
	            /* Object is created for Select class */
				Select dd= new Select(source);
				
				
				/* Select by visible text - to select th options from the dropdown list */
				dd.selectByVisibleText("Employee");
				
		//Marketing Campaign
				
				/* Identify the  drop down field */
				WebElement MktCamp = driver.findElementById("createLeadForm_marketingCampaignId");
		
	            /* Object is created for Select class */
				Select dd1= new Select(MktCamp);
				
				
				/* Select by value  - to select the options from the drop down list */
				dd1.selectByValue("9001");
				
				
        //Industry
				
				/* Identify the  drop down field */
				WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		
	            /* Object is created for Select class */
				Select dd2= new Select(industry);
				
	
				/*Select value as Telecommunications from the bottom (size-2) in Industry using SelectByIndex */
				
				   /* getoptions is a method that will return the complete list of web elements in the dropdown and returns to a List web element */
				
				       List<WebElement> options = dd2.getOptions();
				       
				       /*The size of the list is obtained using the size method */
				       int size = options.size();
				       
				       /* selecting the second largest value from the list */
				       
				         dd2.selectByIndex(size-2);
				         
				         
			 /*Select value as India in Country Field Using SelectbyVisibletext*/
				
				/* Identify the  drop down field */
				WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		
	            /* Object is created for Select class */
				Select dd3= new Select(country);
				
	
				/* Select by visible text - to select the options from the drop down list */
				dd3.selectByVisibleText("India");
				
				
				
			/*Select value as Corporation in OwnerShip field Using SelectbyIndex */
				
				/* Identify the  drop down field */
				WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		
	            /* Object is created for Select class */
				Select dd4= new Select(ownership);
				
	
				/* Select by index - to select the options from the drop down list */
			    dd4.selectByIndex(5);
			    
			    
			    
			   /* Click on create Lead Button Using name Locator */
			    
			    driver.findElementByName("submitButton").click();
			    
			    
			    /* The Title of the Landing page */
			    System.out.println(driver.getTitle()); ;
			    
			    
			    /* Close the browser */
			    driver.close();
				
		
		
	}

	
	
}
