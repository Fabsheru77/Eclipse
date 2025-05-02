import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Guru99Test {
    private WebDriver driver;

    @Before
    public void setUp() {
    	WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized"); // open Browser in maximized mode
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--disable-gpu"); // applicable to Windows os only
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("--no-sandbox"); // Bypass OS security model
        options.addArguments("--disable-in-process-stack-traces");
        options.addArguments("--disable-logging");
        options.addArguments("--log-level=3");
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
    }


    @Test
    public void testGuru99Form() {
        String baseUrl = "https://demo.guru99.com/test/login.html";					
        driver.get(baseUrl);
        
        //access email field
        WebElement email = driver.findElement(By.id("email"));
        
        //access password field
        WebElement password = driver.findElement(By.name("passwd"));
       
        //adding data to email and password
        email.sendKeys("abcd@gmail.com");
        password.sendKeys("abcdefghlkjl");
        System.out.println("login and password entered");
        
        //clear text boxes
        email.clear();
        password.clear();
        System.out.println("text boxes cleared");
        
        email.sendKeys("abcd@gmail.com");
        password.sendKeys("abcdefghlkjl");
      
        WebElement login = driver.findElement(By.id("SubmitLogin"));
        
        //submit form
        login.click();
        
        System.out.println("Form submitted");

        // Locate the single element by class name
        WebElement feedback = driver.findElement(By.className("error-copy"));
        assertTrue(feedback.getText().contains("Successfully Logged in..."));
    }

    @After
    public void tearDown() {
        if (driver != null) {
            //driver.quit();
        }
    }
}
