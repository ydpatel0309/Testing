package Testing.Testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginPage {

    private WebDriver driver;

    @Before 
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\seleniumjd\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/login");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    // Test Case 1
    public void testCorrectCredentials() throws InterruptedException {
        testCaseCorrectCredentials("YashPatel", "Ydpatel@393");
    }

    @Test
    // Test Case 2
    public void testWrongUsername() throws InterruptedException {
        testCaseWrongUsername("Ydpatel", "Ydpatel@393");
    }

    @Test
    // Test Case 3
    public void testWrongPassword() throws InterruptedException {
        testCaseWrongPassword("YashPatel", "YashPatel");
    }

    @Test
    // Test Case 4
    public void testWrongBoth() throws InterruptedException {
        testCaseWrongBoth("Yash", "Patel");
    }

    // Test Case 1: True Positive
    public void testCaseCorrectCredentials(String username, String password) throws InterruptedException {
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
    }

    // Test Case 2: False Positive
    public void testCaseWrongUsername(String username, String password) throws InterruptedException {
        driver.findElement(By.id("userName")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login")).click();

        Thread.sleep(3000);

        if (driver.getCurrentUrl().equals("https://demoqa.com/login")) {
            System.out.println("Test Case - Wrong Username and Correct Password: Login unsuccessful.");
        } else {
            System.out.println("Test Case - Wrong Username and Correct Password: Login successful!");
        }
    }

    // Test Case 3: True Negative
    public void testCaseWrongPassword(String username, String password) throws InterruptedException {
        driver.findElement(By.id("userName")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login")).click();

        Thread.sleep(3000);

        if (driver.getCurrentUrl().equals("https://demoqa.com/login")) {
            System.out.println("Test Case - Correct Username and Wrong Password: Login unsuccessful.");
        } else {
            System.out.println("Test Case - Correct Username and Wrong Password: Login successful!");
        }
    }

    // Test Case 4: False Negative
    public void testCaseWrongBoth(String username, String password) throws InterruptedException {
        driver.findElement(By.id("userName")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login")).click();

        Thread.sleep(3000);

        if (driver.getCurrentUrl().equals("https://demoqa.com/login")) {
            System.out.println("Test Case - Wrong Username and Wrong Password: Login unsuccessful.");
        } else {
            System.out.println("Test Case - Wrong Username and Wrong Password: Login successful!");
        }
    }
}
