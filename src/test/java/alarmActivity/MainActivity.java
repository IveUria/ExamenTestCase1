package alarmActivity;

import appiumControl.Button;
import appiumControl.Label;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class MainActivity {
    public Button addButton;
    public Button settingsButton;
    public TextBox tableAlarm;

    public MainActivity(){
        addButton = new Button(By.id("ar.com.basejuegos.simplealarm:id/newAlarmButton"));
        settingsButton = new Button(By.id("ar.com.basejuegos.simplealarm:id/settingsButton"));
        tableAlarm = new TextBox(By.id("ar.com.basejuegos.simplealarm:id/alarmsAndFooterTable"));

    }
    public boolean isDisplayedAlarm(String name){
        String locator = "//android.widget.TextView[@content-desc=\"Enabled Alarm "+name+"\"]";
        Label contact = new Label(By.xpath(locator));
        return  contact.isDisplayed();

    }
}
