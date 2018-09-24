package us.jmallas1.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Main class to demonstrate wibbly wobbly
 * timey wimey date math
 * @author Jared Mallas
 * @version 1.0
 */
public class datesMain
{
    public static void main(String[] args)
    {
        Date jTree = new GregorianCalendar(1987, 3, 9).getTime();
        Date rHum = new GregorianCalendar(1988, 10, 10).getTime();
        Date today = new Date();

        Calendar jtCal = Calendar.getInstance();
        Calendar tCal = Calendar.getInstance();
        Calendar rhCal = Calendar.getInstance();

        jtCal.setTime(jTree);
        rhCal.setTime(rHum);
        tCal.setTime(today);

        Integer yrs = tCal.get(Calendar.YEAR) - jtCal.get(Calendar.YEAR);
        Integer mon = tCal.get(Calendar.MONTH) - jtCal.get(Calendar.MONTH);
        Integer day = tCal.get(Calendar.DATE) - jtCal.get(Calendar.DATE);

        Integer jtRhyrs = rhCal.get(Calendar.YEAR) - jtCal.get(Calendar.YEAR);
        Integer jtRhmon = rhCal.get(Calendar.MONTH) - jtCal.get(Calendar.MONTH);
        Integer jtRhday = rhCal.get(Calendar.DATE) - jtCal.get(Calendar.DATE);

        tCal.add(Calendar.DATE, jtRhday);
        tCal.add(Calendar.MONTH, jtRhmon);
        tCal.add(Calendar.YEAR, jtRhyrs);

        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd YYYY");
        String releaseDate = sdf.format(tCal.getTime());

        System.out.println("Joshua Tree was released " + yrs + " years " +
                mon + " months and " + day + " days ago.");

        System.out.println("Rattle and Hum was released " + jtRhyrs + " years " +
                jtRhmon + " months and " + jtRhday + " days later");

        System.out.println("If Joshua Tree was released today, and it took the " +
                "same amount of time to release Rattle and Hum...");

        System.out.println("Rattle and Hum would be released on " + releaseDate);

    }
}
