package Testing.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginPage {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\seleniumjd\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Test Case 1: Correct Username and Correct Password
        testCaseCorrectCredentials("YashPatel", "Ydpatel@393");

        // Test Case 2: Wrong Username and Correct Password
        testCaseWrongUsername("Ydpatel", "Ydpatel@393");

        // Test Case 3: Correct Username and Wrong Password
        testCaseWrongPassword("YashPatel", "YashPatel");
        
        //Test Case 4: Both wrong
        
        testCaseWrongBoth("Yash","Patel");
    }

    // Test Case 1: True Positive
    public static void testCaseCorrectCredentials(String username, String password) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/login");
        driver.manage().window().maximize();

        driver.findElement(By.id("userName")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login")).click();

        Thread.sleep(3000);
		
		driver.findElement(By.id("searchBox")).sendKeys("Git");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("gotoStore")).click();
		
		Thread.sleep(3000);
		
        if (driver.getCurrentUrl().equals("https://demoqa.com/login")) {
            System.out.println("Test Case - Correct Username and Correct Password: Login unsuccessful.");
        } else {
            System.out.println("Test Case - Correct Username and Correct Password: Login successful!");
        }
        
        driver.quit();
    }

    // Test Case 2:  False Positive
    public static void testCaseWrongUsername(String username, String password) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/login");
        driver.manage().window().maximize();

        driver.findElement(By.id("userName")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login")).click();

        Thread.sleep(3000);

        if (driver.getCurrentUrl().equals("https://demoqa.com/login")) {
            System.out.println("Test Case - Wrong Username and Correct Password: Login unsuccessful.");
        } else {
            System.out.println("Test Case - Wrong Username and Correct Password: Login successful!");
        }

        driver.quit();
    }

    // Test Case 3:  True Negative
    public static void testCaseWrongPassword(String username, String password) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/login");
        driver.manage().window().maximize();

        driver.findElement(By.id("userName")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login")).click();

        Thread.sleep(3000);

        if (driver.getCurrentUrl().equals("https://demoqa.com/login")) {
            System.out.println("Test Case - Correct Username and Wrong Password: Login unsuccessful.");
        } else {
            System.out.println("Test Case - Correct Username and Wrong Password: Login successful!");
        }

        driver.quit();
    }
    
    // Test Case 4:  FalseNegative
    public static void testCaseWrongBoth(String username,String password)  throws InterruptedException
    {
    	WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/login");
        driver.manage().window().maximize();

        driver.findElement(By.id("userName")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login")).click();

        Thread.sleep(3000);

        if (driver.getCurrentUrl().equals("https://demoqa.com/login")) {
            System.out.println("Test Case - Wrong Username and Wrong Password: Login unsuccessful.");
        } else {
            System.out.println("Test Case - Wrong Username and Wrong Password: Login successful!");
        }

        driver.quit();
    	
    }
}

