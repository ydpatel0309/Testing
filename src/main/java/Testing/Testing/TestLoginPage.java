package Testing.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginPage {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "D:\\seleniumjd\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/login");
        driver.manage().window().maximize();

        // Targeting id Username to fill the text
        driver.findElement(By.id("userName")).sendKeys("YashPatel");

        // Targeting id password to fill password
        driver.findElement(By.id("password")).sendKeys("Ydpatel@393");
    
        Thread.sleep(3000); // for delaying execution
        
        // targeting button Login and clicking .
        driver.findElement(By.id("login")).click();

        Thread.sleep(3000); 

        // Check if login was successful or not
        if (driver.getCurrentUrl().equals("https://demoqa.com/login")) {
            System.out.println("Invalid username or password. Login unsuccessful.");
        } else {
            System.out.println("Login successful!");

            // Targeting id searchBox to fill Git
            driver.findElement(By.id("searchBox")).sendKeys("Git");

            Thread.sleep(3000);
            // Targeting id gotoStore button to move to the store page
            driver.findElement(By.id("gotoStore")).click();
        }

        Thread.sleep(3000);
        // Close the browser
        driver.quit();
    }
}
