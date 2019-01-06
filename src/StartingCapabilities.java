import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class StartingCapabilities {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		
		// Before running code below, make sure
		// Appium server is started and emulator is open
		
		// Appium code below
		
		// Targets src directory and stores path
		File file = new File("src");
		// Targets app within src director and stores entire path
		File fileName = new File(file, "ApiDemos-debug.apk");
		
		DesiredCapabilities dc = new DesiredCapabilities();
		// This set which emulator device name to be tested on
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");
		// This targets app within src directory and sets it as a 
		// capability to be installed on emulator device
		dc.setCapability(MobileCapabilityType.APP, fileName.getAbsolutePath());
		
		// Connects to server
		// Create AndroidDriver to automation all test.
		// Pass first argument with is the connection to server link
		// which contains server IP address.
		// 127.0.0.1 is a common Windows machine local host IP address
		// Pass the second argument which is DesiredCapabilities 
		// to set specific parameters
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		return driver;
		//AndroidUIAutomator
	}

}
