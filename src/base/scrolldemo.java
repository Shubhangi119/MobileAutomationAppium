package base;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.net.MalformedURLException;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class scrolldemo extends HybridBaseDriver{
	
	
	public static void main(String[]args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver=capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
  driver.findElementByAndroidUIAutomator("new UiScrollable(new UISelector()).scrollIntoView(text(\"WebView\"));");

		//android code in androiduiautomator it is not the appium code



	
	}
	

}
