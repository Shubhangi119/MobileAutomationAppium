package base;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import io.appium.java_client.touch.LongPressOptions;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class Gestures extends HybridBaseDriver{

	public static void main(String[]args) throws MalformedURLException {

	
	
	
	
	AndroidDriver<AndroidElement> driver=capabilities("real");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
	  
	  //tap
		TouchAction t=new TouchAction(driver);
		WebElement expandlist= driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']"); 
		t.tap(tapOptions().withElement(element(expandlist))).perform();
		
		//long press  
		driver.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']")).click();
			WebElement pn= driver.findElementByXPath("//android.widget.TextView[@text='People Names']"); 
			t.longPress(LongPressOptions.longPressOptions().withElement(element(pn)).withDuration(Duration.ofSeconds(2))).release().perform();
			System.out.println(driver.findElementById("android:id/title").isDisplayed());
			
			
			
			

}
}
