package testAlarm;

import alarmActivity.ActivityAlarm;
import alarmActivity.MainActivity;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;

public class addAlarmTest {
    String day = "FR";
    String hour = "05";
    String minute = "10";
    String alarmTime = hour+":"+minute ;
    MainActivity actionButton = new MainActivity();
    ActivityAlarm alarm = new ActivityAlarm(day, hour, minute);
    @Test
    public void addAlarm () throws MalformedURLException {
        String alarmName = "AJUAN";
        actionButton.addButton.click();
        //ingreso del nombre de la alarma
        alarm.alarmNameText.type(alarmName);
        //seleccion del dia para la alarma
        alarm.selectDay.selectType();
        //ingreso de la hora para la alarma
        alarm.selectHour1.click();
        alarm.selectHour2.click();
        // ingreso de los minutos para la alarma
        alarm.selectMinute1.click();
        alarm.selectMinute2.click();
        // guardar los datos ingresados
        alarm.saveDialogButton.click();
        Assert.assertTrue("ERROR NO SE ENCONTRO LA ALARMA ",actionButton.isDisplayedAlarm(alarmTime));
    }
}


