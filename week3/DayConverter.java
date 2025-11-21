package week3;
import java.util.*;


/**
 * Write a description of class DayConverter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DayConverter
{
    public static void main(String[]arg)
    {
        Scanner S = new Scanner(System.in);

        System.out.println("Write number of days");
        int day = S.nextInt();
        int year = day/365;
        int month=day/30;
        int ds=day%365;
        int dss=ds%365;
        System.out.println("the given days counteris:>>>>years:"+year+"months"+month+"days"+dss);
        
    }
}