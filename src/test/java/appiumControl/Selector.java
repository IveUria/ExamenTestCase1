package appiumControl;

import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.nio.channels.SeekableByteChannel;

import org.openqa.selenium.support.ui.Select;

public class Selector extends  Control{
    public Selector(By locator){
        super(locator);
    }
    public void selectType() throws MalformedURLException {
        this.findControl();
        control.click();
    }

}
