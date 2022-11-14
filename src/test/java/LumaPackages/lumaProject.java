package LumaPackages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class lumaProject{
	@Test
	public void StartTest() throws InterruptedException{
		  WebDriverManager.chromedriver().setup();
		    WebDriver driver =new ChromeDriver();
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		    driver.manage().window().maximize();
		    driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
		    WebElement Email = driver.findElement(By.id("email"));
		   Email.sendKeys("practiclearn@gmail.com");
		    WebElement Password= driver.findElement(By.id("pass"));
		    Password.sendKeys("Learn123");
		    WebElement SignIn = driver.findElement(By.id("send2"));
		    SignIn.click();
		    WebElement HomePage= driver.findElement(By.xpath("//a[@href='https://magento.softwaretestingboard.com/what-is-new.html']//span"));
		    HomePage.click();
		    Thread.sleep(5000);
//		    driver.quit();
		    
		    Actions actions =new Actions(driver);
		    WebElement MainManu =driver.findElement(By.xpath("//a[@id='ui-id-4']//span[2]"));
		    actions.moveToElement(MainManu).perform();
		    Thread.sleep(2000);
		    WebElement SubManu =driver.findElement(By.xpath("//a[@id='ui-id-9']"));
		    actions.moveToElement(SubManu).perform();
		    Thread.sleep(2000);
		    WebElement subSubManu =driver.findElement(By.xpath("//a[@id='ui-id-11']//span"));
		    actions.moveToElement(subSubManu).perform();
		    actions.click().build().perform();
			js.executeScript("window.scrollBy(0,300)");
		    WebElement Item = driver.findElement(By.cssSelector("img[alt='Olivia 1/4 Zip Light Jacket']"));
		    Item.click();
		    Thread.sleep(2000);
		    WebElement SIZE = driver.findElement(By.xpath("//div[@aria-label='L']"));
		    SIZE.click();
		    js.executeScript("window.scrollBy(0,300)");
		    Thread.sleep(2000);
		    WebElement Color = driver.findElement(By.xpath("//div[@aria-label='Purple']"));
		    Color.click();
		    Thread.sleep(2000);
		   WebElement AddCard =driver.findElement(By.xpath("//button[@title='Add to Cart']"));
		   AddCard.click();
		   Thread.sleep(2000);
		   
		   WebElement Card =driver.findElement(By.xpath("//a[@href='https://magento.softwaretestingboard.com/checkout/cart/']"));
		   Card.click();
//
	
		   Thread.sleep(5000);
		   WebElement Take =driver.findElement(By.xpath("//body/div/header/div/div[@data-block='minicart']/a[1]"));
		   Take.click();
//
		   Thread.sleep(5000);
		   WebElement Bye =driver.findElement(By.xpath("//button[@title='Proceed to Checkout']"));
		   Bye.click();
		   Thread.sleep(15000);
           js.executeScript("window.scrollBy(0,300)");
		   WebElement Next =driver.findElement(By.xpath("//button[@data-role='opc-continue']"));
		   Next.click();
//		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Next")));
		   Thread.sleep(10000);
		   js.executeScript("window.scrollBy(0,300)");
		   WebElement Order =driver.findElement(By.xpath("//button[@title='Place Order']"));
		   Order.click();
		   Thread.sleep(5000);
		   WebElement Text = driver.findElement(By.xpath("//span[@data-ui-id='page-title-wrapper']"));
		   System.out.println(Text.getText());
		   assertEquals(Text.getText(),"Thank you for your purchase!");
//		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Text")));
		   assertTrue(Text.getText().contains("Thank you for your purchase!"));

		   Thread.sleep(5000);
		   WebElement Continu =driver.findElement(By.xpath("//a[@class='action primary continue']"));
		   Continu.click();
		 ;

		   



	}
}