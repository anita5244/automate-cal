package claculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Substraction {
	public  WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  Thread.sleep(5000);
	     driver.findElement(By.xpath("//span[contains(text(),'Back')]")).click();
	     driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
	     driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
	     driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
	     driver.findElement(By.xpath("//span[contains(text(),'8')]")).click();
	     driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
	     driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
	     driver.findElement(By.xpath("//span[contains(text(),'–')]")).click();
	     driver.findElement(By.xpath("//span[contains(text(),'–')]")).click();
	     driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
	     driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
	     driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
	     
	     driver.findElement(By.xpath("//span[contains(text(),'9')]")).click();
	     driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
	     driver.findElement(By.xpath("//span[contains(text(),'8')]")).click();
	     driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
	     driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
	     driver.findElement(By.xpath("//span[contains(text(),'=')]")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver=new ChromeDriver();
	  driver.get(" https://www.calculator.net/");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\testworkspace\\chromedriver.exe");
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.close();
  }

}
