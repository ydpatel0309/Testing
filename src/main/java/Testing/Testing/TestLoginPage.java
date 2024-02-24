package Testing.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\seleniumjd\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		
		
	    driver.get("https://demoqa.com/login");	
	    //keeping window at max size (Full screen)
	    driver.manage().window().maximize();
		
	    //Targeting id Username to fill the text
		driver.findElement(By.id("userName")).sendKeys("YashPatel");
		
		//Targeting id password to fill password
		driver.findElement(By.id("password")).sendKeys("Ydpatel@393");
		
		//targeting button Login and clicking .
		Thread.sleep(3000);
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("searchBox")).sendKeys("Ydpatel@393");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("gotoStore")).click();

	}

}
