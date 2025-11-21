package week3;
import java.util.Scanner;


/**
 * Write a description of class converter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class converter
{
    public static void main(String[]arg)
    {
        Scanner S = new Scanner(System.in);

        System.out.println("Write time in seconds");
        int second = S.nextInt();
        int minutes= second/60;
        int hours = minutes/60;
        int mins=(second%3600);
        int seconds=second/3600;
        int sec=seconds/3600;
        System.out.println("the given time in time is:>>>>Hours:"+hours+"minutes"+minutes+"seconds"+sec);
        
    }
}