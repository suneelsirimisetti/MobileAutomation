package config;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class HarvestOrder_Login {
	//public static AppiumDriver driver;
	public AppiumDriver driver;

	@BeforeSuite
	public void setUp() throws MalformedURLException {
		//File appDir = new File("C:/Mobile Automation -Downloads");
		//File app = new File(appDir, "GrowerPortal-version1.0.0.A.apk");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		//capabilities.setCapability("deviceName", "2960b6149904");
		capabilities.setCapability("deviceName", "Emulator");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.driscolls");
		capabilities.setCapability("appActivity", "com.driscolls.MainActivity");

		//capabilities.setCapability("app", app.getAbsolutePath());
		//driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		//driver = new AndroidDriver(new URL("http://172.31.13.65/wd/hub"), capabilities);
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	@BeforeClass
	public void Driscolls_OktaLogin() throws InterruptedException {
			Thread.sleep(5000);
			System.out.println("About pre hit");
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		List<WebElement> growerportal_HomePage = driver.findElements(By.className("android.view.ViewGroup"));
		growerportal_HomePage.get(0).click();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		System.out.println("About to click");
		//driver.findElement(By.className("android.view.ViewGroup")).click();
		List<WebElement> okta_Login = driver.findElements(By.className("android.widget.EditText"));
		okta_Login.get(0).sendKeys("uvikki@gmail.com");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		okta_Login.get(1).sendKeys("Carbon14");
		List<WebElement> okta_SighIn = driver.findElements(By.className("android.widget.Button"));
		okta_SighIn.get(0).click();
	}

	@Test(priority = 1)
	public void Navigate_SubmitForecast() throws InterruptedException {
		System.out.println("Navigate to Submit Forecast");
		Thread.sleep(10000);
		List<WebElement> MainHO = driver.findElements(By.className("android.widget.TextView"));

		for (WebElement a : MainHO) {
			String val = a.getText();
			if (val.equals("Submit Forecast")) {
				a.click();
				System.out.println("Clicked on Submit Forecast");
			}
		}
		System.out.println("Navigate back to home page");
		List<WebElement> navigate_Back = driver.findElements(By.className("android.widget.TextView"));
		navigate_Back.get(0).click();
	}

	@Test(priority = 2)
	public void Navigate_HarvestOrder() throws InterruptedException {
		System.out.println("Navigate to Harvest Orders");
		Thread.sleep(100);
		List<WebElement> HarvestOrder = driver.findElements(By.className("android.widget.TextView"));

		for (WebElement a : HarvestOrder) {
			String val = a.getText();
			if (val.equals("Harvest Orders")) {
				a.click();
				System.out.println("Clicked on Harvest Orders");
			}
		}
		System.out.println("Navigate back to home page");
		List<WebElement> navigate_Back = driver.findElements(By.className("android.widget.TextView"));
		navigate_Back.get(0).click();
	}

	@Test(priority = 3)
	public void Navigate_Reports() throws InterruptedException {
		System.out.println("Navigate to Reports");
		Thread.sleep(100);
		List<WebElement> Reports = driver.findElements(By.className("android.widget.TextView"));

		for (WebElement a : Reports) {
			String val = a.getText();
			if (val.equals("Reports")) {
				a.click();
				System.out.println("Clicked on Reports");
			}
		}
		System.out.println("Navigate back to home page");
		List<WebElement> navigate_Back = driver.findElements(By.className("android.widget.TextView"));
		navigate_Back.get(0).click();
	}

	@Test(priority = 4)
	public void Navigate_MyProfile() throws InterruptedException {
		System.out.println("Navigate to My Profile");
		Thread.sleep(100);
		List<WebElement> MyProfile = driver.findElements(By.className("android.widget.TextView"));

		for (WebElement a : MyProfile) {
			String val = a.getText();
			if (val.equals("My Profile")) {
				a.click();
				System.out.println("Clicked on My Profile");
			}
		}
		System.out.println("Navigate back to home page");
		List<WebElement> navigate_Back = driver.findElements(By.className("android.widget.TextView"));
		navigate_Back.get(0).click();
	}
		
	@Test(priority = 5)
	public void Navigate_Forecast() throws InterruptedException {
		System.out.println("Navigate to Forecast");
		Thread.sleep(100);
		List<WebElement> MyProfile = driver.findElements(By.className("android.widget.TextView"));

		for (WebElement a : MyProfile) {
			String val = a.getText();
			if (val.equals("Forecast")) {
				a.click();
				System.out.println("Clicked on Forecast");
			}
		}
		System.out.println("Navigate back to home page");
		List<WebElement> navigate_Back = driver.findElements(By.className("android.widget.TextView"));
		navigate_Back.get(0).click();
	}
	@Test(priority = 6)
	public void Navigate_Orders() throws InterruptedException {
		System.out.println("Navigate to Orders");
		Thread.sleep(100);
		List<WebElement> MyProfile = driver.findElements(By.className("android.widget.TextView"));

		for (WebElement a : MyProfile) {
			String val = a.getText();
			if (val.equals("Orders")) {
				a.click();
				System.out.println("Clicked on Orders");
			}
		}
		System.out.println("Navigate back to home page");
		List<WebElement> navigate_Back = driver.findElements(By.className("android.widget.TextView"));
		navigate_Back.get(0).click();
	}
	@Test(priority = 7)
	public void Navigate_TaskBarReports() throws InterruptedException {
		System.out.println("Navigate to Reports");
		Thread.sleep(100);
		List<WebElement> MyProfile = driver.findElements(By.className("android.widget.TextView"));

		for (WebElement a : MyProfile) {
			String val = a.getText();
			if (val.equals("Reports")) {
				a.click();
				System.out.println("Clicked on Reports");
			}
		}
		System.out.println("Navigate back to home page");
		List<WebElement> navigate_Back = driver.findElements(By.className("android.widget.TextView"));
		navigate_Back.get(0).click();
	}
	
	@Test(priority = 8)
	public void Navigate_Home() throws InterruptedException {
		System.out.println("Navigate to Home");
		Thread.sleep(100);
		List<WebElement> MyProfile = driver.findElements(By.className("android.widget.TextView"));

		for (WebElement a : MyProfile) {
			String val = a.getText();
			if (val.equals("Home")) {
				a.click();
				System.out.println("Clicked on Home");
			}
		}
		System.out.println("Navigate back to home page");
		List<WebElement> navigate_Back = driver.findElements(By.className("android.widget.TextView"));
		navigate_Back.get(0).click();
	}
	
	
	@AfterSuite
	public void Tear_Down() throws InterruptedException {
		driver.findElement(new ByAll(By.className("android.view.ViewGroup"),
				By.xpath("//android.widget.TextView[text()='Logout']"))).click();
		Thread.sleep(100);
		driver.quit();
	}
}
