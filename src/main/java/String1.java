import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class String1 {

    public static void main(String[] args) throws ParseException {
       String beforeCovDate = "15/10/2023";
        SimpleDateFormat format = new SimpleDateFormat("dd/M/yyyy");
        Date afterCov = format.parse(beforeCovDate);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(afterCov);


        System.out.println(calendar.get(Calendar.YEAR));



    }
}
