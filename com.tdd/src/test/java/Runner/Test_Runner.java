package Runner;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Test_Runner {
WebDriver driver;
String title;
@Test
public void test() 
{
	title=driver.getTitle();
	System.out.println(driver.getTitle());
	Assert.assertEquals("IPL Fantasy League", title);
	}
@BeforeTest
public void beforeTest()
{
	//System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
	//File pathBinary = new File("/usr/lib/firefox/firefox.sh");
	//System.setProperty("webdriver.firefox.bin", pathBinary.getAbsolutePath());
	System.setProperty("webdriver.gecko.driver", "E:\\gecko\\geckodriver.exe");
	driver= new FirefoxDriver();
	driver.get("http://13.251.223.160:8090/IPL-Fantasy-League-0.0.1-SNAPSHOT/");

}
@AfterTest
public void afterTest(){
	System.out.println("Running1");
}
}
