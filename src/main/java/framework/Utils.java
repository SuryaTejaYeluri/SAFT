package framework;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    public static String getTimeStamp(String formatString){
        DateFormat dateFormat = new SimpleDateFormat(formatString);
        return dateFormat.format(new Date());
    }
}
