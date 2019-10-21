package comviva.com.pretups;

import java.io.IOException;
import java.lang.System.Logger;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageObject.LandingPage;
import resources1.base;


public class HomePage extends base{
	
	
public static org.apache.logging.log4j.Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initializeChrome() throws IOException
	{
		
		log.info("Driver is initialized");
		driver = initializeDriver();
        driver.get(prop.getProperty("url"));
	}

    @Test
	public void  basePageNavigation() throws IOException
	{
	    LandingPage l = new LandingPage(driver);
	    //Log.info("enter login id");
	    //Log.info("Enter Login Credentials");
		l.getloginID().sendKeys("willpowerprincess1");
	}

	@AfterTest
	public void tearDown()
	{
		//driver.close();

	}

}
