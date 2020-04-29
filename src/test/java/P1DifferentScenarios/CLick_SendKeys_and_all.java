package P1DifferentScenarios;
import java.net.MalformedURLException;
import java.time.Duration;
import org.openqa.selenium.By;
import P1.base;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;


public class CLick_SendKeys_and_all extends base {
	
	public static AndroidDriver<AndroidElement> start() throws MalformedURLException, InterruptedException {		
		driver = base.base1();
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"Accessibility\")")).click();
		driver.findElementByXPath("//android.widget.TextView[2]").click();
		driver.findElementByClassName("android.widget.ImageButton").click();
		
		for(int i=0;i<4;i++)
		{
		driver.navigate().back();
		}
		Thread.sleep(1000);
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"Preference\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"3. Preference dependencies\")")).click();
		driver.findElement(By.className("android.widget.CheckBox")).click();
		int count = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().checkable(true)")).size();		
		System.out.println(count);
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"WiFi settings\")")).click();

		driver.findElement(By.className("android.widget.EditText")).sendKeys("Love Automation");
		for(int i=0;i<4;i++)
		{
		driver.navigate().back();
		}
		Thread.sleep(2000);
	//	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));"));
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"Views\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"Expandable Lists\")")).click();
		AndroidElement element = driver.findElement(MobileBy.AndroidUIAutomator("text(\"1. Custom Adapter\")"));

				//Touch Action class to handle Gestures
		TouchAction t = new TouchAction(driver);
		t.tap(tapOptions().withElement(element(element))).perform();
		// Long press
		AndroidElement element1 = driver.findElement(MobileBy.AndroidUIAutomator("text(\"Cat Names\")"));
		t.longPress(longPressOptions().withElement(element(element1)).withDuration(Duration.ofSeconds(2))).release().perform();
		for(int i=0;i<3;i++)
		{
		driver.navigate().back();
		}
		AndroidElement date = driver.findElement(MobileBy.AndroidUIAutomator("text(\"Date Widgets\")"));
		t.tap(tapOptions().withElement(element(date))).perform();
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"2. Inline\")")).click();
		return driver;
	
		// Swipping events 
		
		
		
		
		
	
		
		
		
		
		
		
		
		     // 3


		
		
}

	
}
