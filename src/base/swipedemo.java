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

public class swipedemo extends HybridBaseDriver{

	public static void main(String[]args) throws MalformedURLException {

	
	
	
	
	AndroidDriver<AndroidElement> driver=capabilities();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
	  driver.findElement(By.xpath("//android.widget.TextView[@text='Date Widgets']")).click();
	  //android code in androiduiautomator it is not the appium code
	  driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
	  
	  driver.findElement(By.xpath("//*[@content-desc='9']")).click();
	  
	  //longpress//onelement//2 sec//move to another element and you release
	  TouchAction t=new TouchAction(driver);
	  WebElement first=driver.findElement(By.xpath("//*[@content-desc='15']"));
	  WebElement second=driver.findElement(By.xpath("//*[@content-desc='45']"));

 t.longPress(LongPressOptions.longPressOptions().withElement(element(first)).withDuration(Duration.ofSeconds(2))).moveTo(element(second)).release();
	}}
