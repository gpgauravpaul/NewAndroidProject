package P1DifferentScenarios;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import java.net.MalformedURLException;
import org.openqa.selenium.By;
import P1.base;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;


public class SwippingEvents_and_Next extends CLick_SendKeys_and_all
{
	
	public static AndroidDriver<AndroidElement> swipeEvent() throws MalformedURLException, InterruptedException {
		
		
		driver = start();
	
		TouchAction t = new TouchAction(driver);
		driver.findElements(By.className("android.widget.TextView")).get(0).click();
		Thread.sleep(2000);
		AndroidElement element = driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().selected(true)"));
		AndroidElement element2 = driver.findElementByXPath("//*[@content-desc='9']");
		t.longPress(longPressOptions().withElement(element(element))).moveTo(element(element2)).release().perform();
		AndroidElement element3 = driver.findElementByXPath("//*[@content-desc='40']");
		t.longPress(longPressOptions().withElement(element(element))).moveTo(element(element3)).release().perform();
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"AM\")")).click();
		for(int i=0;i<3;i++)
		{
		driver.navigate().back();
		}
		return driver;	
	}
}