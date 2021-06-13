package base;

import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class draganddrop extends HybridBaseDriver{
	
	
	public static void main(String[]args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver=capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Drag and Drop']")).click();
		WebElement source=driver.findElements(By.className("android.view.View")).get(0);
		WebElement destination=driver.findElements(By.className("android.view.View")).get(1);
		
		  TouchAction t=new TouchAction(driver);
  t.longPress(LongPressOptions.longPressOptions().withElement(element(source)).withDuration(Duration.ofSeconds(2))).moveTo(element(destination)).release().perform();
	
	
	}
}
