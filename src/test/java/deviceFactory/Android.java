package deviceFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Android implements IDevice {
    @Override
    public AppiumDriver create() throws MalformedURLException {
        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability("deviceName","Google Pixel 3");
        capabilities.setCapability("platformVersion","10");
        capabilities.setCapability("appPackage","ar.com.basejuegos.simplealarm");
        capabilities.setCapability("appActivity",".SimpleAlarm");
        capabilities.setCapability("platformName","Android");

        AppiumDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        //tiempo que esperara los controles
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        return driver;
    }

}
