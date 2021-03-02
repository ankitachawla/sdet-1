import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;
    
    @BeforeMethod
     public void beforemethod()
     {
    	driver= new FirefoxDriver();
    	driver.get("https://www.training-support.net");
     }
    
    @Test
    public void test()
    {
    	String Title=driver.getTitle();
    	System.out.println("title of the page" + Title);
    	Assert.assertEquals("Training Support",Title);
    	driver.findElement(By.id("about-link")).click();
    	String Title1=driver.getTitle();
    	System.out.println("title of the page" + Title1);
    	Assert.assertEquals(Title1,"About Training Support");
    	
    }
  
    @AfterMethod
    public void Aftermethod()
    {
    	driver.close();
    }
}
    