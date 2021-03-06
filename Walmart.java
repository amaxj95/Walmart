// Generated by Selenium IDE - automated by Austin Jones 
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class UntitledTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() throws MalformedURLException {
    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void untitled() {
    // Test name: Untitled
    // Step # | name | target | value
    // 1 | open | https://www.walmart.com/ | 
    driver.get("https://www.walmart.com/");
    // 2 | click | css=.relative:nth-child(6) > .flex | 
    driver.findElement(By.cssSelector(".relative:nth-child(6) > .flex")).click();
    // 3 | click | css=.w_AU:nth-child(2) | 
    driver.findElement(By.cssSelector(".w_AU:nth-child(2)")).click();
    // 4 | type | id=first-name-su | Wally
    driver.findElement(By.id("first-name-su")).sendKeys("Wally");
    // 5 | type | id=last-name-su | Mart
    driver.findElement(By.id("last-name-su")).sendKeys("Mart");
    // 6 | type | id=email-su | amaxj95@gmail.com
    driver.findElement(By.id("email-su")).sendKeys("YOUREMAIL@EMAIL.COM");
    // 7 | type | id=password-su | walmartPass1
    driver.findElement(By.id("password-su")).sendKeys("walmartPass1");
    // 8 | click | css=div:nth-child(8) > .option > label | 
    driver.findElement(By.cssSelector("div:nth-child(8) > .option > label")).click();
    // 9 | click | css=#sign-up-form > .option > label | 
    driver.findElement(By.cssSelector("#sign-up-form > .option > label")).click();
    // 10 | click | css=#sign-up-form > .button:nth-child(11) | 
    driver.findElement(By.cssSelector("#sign-up-form > .button:nth-child(11)")).click();
    // 11 | close |  | 
    driver.close();
  }
}
