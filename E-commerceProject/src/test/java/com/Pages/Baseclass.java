package com.Pages;


//import org.testng.annotations.Test;


  //import java.io.File;
  //import java.io.IOException;
  //import java.sql.Date;
  //import java.text.SimpleDateFormat;
  import java.time.Duration;

  //import org.openqa.selenium.OutputType;
  //import org.openqa.selenium.TakesScreenshot;
  import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.chrome.ChromeDriver;
  //import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;





public class Baseclass {
	public static WebDriver driver;
  	public HomePage hp;
  	public  IndexPage In;
  	//public ProductStore pp;
  	
  	@BeforeTest
  	public void setup() {
  		 driver = new ChromeDriver();
  		  driver.get("https://www.demoblaze.com/");
  		  driver.manage().window().maximize();
  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  		hp=new HomePage(driver);
  		In = new IndexPage(driver);
  	   // pp = new ProductStore(driver);
  	}
  	
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
  	
  

  