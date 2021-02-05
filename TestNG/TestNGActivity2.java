import org.testng.annotations.Test;

public class TestNGActivity2 {
	ublic class Activity2 {
	    WebDriver driver;
	    
	    @BeforeTest
	    public void beforeMethod() {
	       
	        driver = new FirefoxDriver();	           
	   	    driver.get("https://www.training-support.net/selenium/target-practice");
	    }
	    
	    @Test
	    public void testCase1() {
	        String title = driver.getTitle();
	        System.out.println("Title is: " + title);
	        Assert.assertEquals(title, "Target Practice");
	    }
	    
	    @Test
	    public void testCase2() {
	        
	        WebElement blackButton = driver.findElement(By.cssSelector("button.black"));
	        Assert.assertTrue(blackButton.isDisplayed());
	        Assert.assertEquals(blackButton.getText(), "black");
	    }
	    
	    @Test(enabled = false)
	    public void testCase3() {
	        /
	        String subHeading = driver.findElement(By.className("sub")).getText();
	        Assert.assertTrue(subHeading.contains("Practice"));
	    }
	    
	    @Test
	    public void testCase4() {
	       
	        throw new SkipException("Skipping test case");      
	    }
	 
	    @AfterTest
	    public void afterMethod() {
	       
	        driver.close();
	    }
	 


}
