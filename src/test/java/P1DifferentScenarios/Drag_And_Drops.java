package P1DifferentScenarios;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

public class Drag_And_Drops extends SwippingEvents_and_Next {
	
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
		driver = swipeEvent();
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"Views\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"Drag and Drop\")")).click();
		Thread.sleep(2000);
		AndroidElement one = driver.findElements(By.className("android.view.View")).get(1);
		AndroidElement two = driver.findElements(By.className("android.view.View")).get(4);
		TouchAction t = new TouchAction(driver);
        t.longPress(longPressOptions().withElement(element(one))).moveTo(element(two)).release().perform();

		
		
		
		
	}


}
