package deviceFactory;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public interface IDevice {
    //Metodos para crear driver
    AppiumDriver create() throws MalformedURLException;

}
