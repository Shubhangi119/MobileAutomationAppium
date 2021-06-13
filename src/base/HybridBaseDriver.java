package base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class HybridBaseDriver {

	
	public static AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException{
		
		
		
		AndroidDriver<AndroidElement> driver;
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ShubhangiEmulator");
	File f=new File("src");
	File fs = new File(f,"ApiDemos-debug.apk");
	
	DesiredCapabilities cap = new DesiredCapabilities();
    if(device.equals("emulator")) {
    	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ShubhangiEmulator");
	}
    
    else if(device.equals("real")) {
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

	}
    cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
    
         driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	return driver;	
}
}

