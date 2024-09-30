import java.text.SimpleDateFormat;
import java.util.Date;

public class Newclass {
    public static void main(String[] args) {
        Date date = new Date();
        String[] formats = {
            "dd/MM/yyyy", 
            "MM-dd-yyyy", 
            "EEEEEE MMMM dd yyyy", 
            "E MMMM dd HH:mm:ss z yyyy", 
            "dd/MM/yy HH:mm:ss a Z", 
            "hh:mm:ss", 
            "w", 
            "W", 
            "D"
        };

        String[] labels = {
            "Current date is: ", 
            "Current date is: ", 
            "Current date is: ", 
            "Current date and time is: ", 
            "Current date and time is: ", 
            "Current time is: ", 
            "Current week of year is: ", 
            "Current week of the month is: ", 
            "Current day of the year: "
        };

        for (int i = 0; i < formats.length; i++) {
            System.out.println(labels[i] + new SimpleDateFormat(formats[i]).format(date));
        }
    }
}