package timeConversion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConverter {
    public static String timeConversion(String s)  {
        // Write your code here

        // Format of the date defined in the input String hh:mm:ssaa
        DateFormat dateFormat= new SimpleDateFormat("hh:mm:ss aa");

        // Change the pattern into 24 hour format HH:mm:ss
        DateFormat format = new SimpleDateFormat("HH:mm:ss");

        // Converting the input String to Date
        Date time = null;
        try {
            time = dateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Changing the format of date and storing it in String
        String output = format.format(time);
        System.out.println(output);
        return output;
     }

    //driver class
    public static void main(String[] args) throws ParseException {
        String s="07:05:45 PM";
        timeConversion(s);
    }
}
