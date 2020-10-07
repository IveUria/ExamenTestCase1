package alarmActivity;

import appiumControl.Button;
import appiumControl.Selector;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class ActivityAlarm {
    public Button saveButton;
    public Button cancelButton;
    public TextBox alarmNameText;
    public String day;
    public String hour;
    public Selector selectDay;
    public Button saveDialogButton;
    public Button selectHour1;
    public Button selectHour2;
    public Button selectMinute1;
    public Button selectMinute2;

    public ActivityAlarm(String dayInt,String hourInt,String minuteInt){
        saveButton = new Button(By.id("ar.com.basejuegos.simplealarm:id/saveAlarmButton"));
        cancelButton = new Button(By.id("ar.com.basejuegos.simplealarm:id/cancelAlarmButton"));
        saveDialogButton = new Button(By.id ("ar.com.basejuegos.simplealarm:id/saveAlarmButton"));
        alarmNameText = new TextBox(By.id("ar.com.basejuegos.simplealarm:id/editTextField"));
        // localizador del dia
        selectDay = new Selector(By.xpath(selectDay(dayInt)));
        // localizadores de hora y minutos
        selectHour1 = new Button (By.xpath(selectHour(hourInt.substring(0,1))));
        selectHour2 = new Button (By.xpath(selectHour(hourInt.substring(1,2))));
        selectMinute1 = new Button (By.xpath(selectHour(minuteInt.substring(0,1))));
        selectMinute2 = new Button (By.xpath(selectHour(minuteInt.substring(1,2))));
    }
    //metodo que arma el xpath para la hora y minutos en funcion de los datos
    //enviados en hourInput

    public String selectHour(String hourInput){
        switch (hourInput){
            case "00": { hourInput = "10";      break;}
            case "0": { hourInput = "11";      break;}
            default: break;
        }
        hour = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.Button["+hourInput+"]";
        return hour;
    }
    //metodo que arma el xpath para la seleccion de dias

    public String selectDay (String dayInput){
        switch (dayInput){
            case "SU": {
                day = "//android.widget.TextView[@content-desc=\"Sunday Disabled\"]";
                break;}
            case "MO": {
                day = "//android.widget.TextView[@content-desc=\"Monday Disabled\"]";
                break; }
            case "TU": {
                day = "//android.widget.TextView[@content-desc=\"Tuesday Disabled\"]";
                break; }
            case "WE": {
                day = "//android.widget.TextView[@content-desc=\"Wednesday Disabled\"]";
                break; }
            case "TH": {
                day = "//android.widget.TextView[@content-desc=\"Thursday Disabled\"]";
                break;
            }
            case "FR":{
                day = "//android.widget.TextView[@content-desc=\"Friday Disabled\"]";
                break;
            }
            case "SA":{
                day = "//android.widget.TextView[@content-desc=\"Saturday Disabled\"]";
                break;
            }
            default :
                day = "//android.widget.TextView[@content-desc=\"Sunday Disabled\"]";
                break;
        }
        return day;
    }


}


