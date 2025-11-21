import java.util.Scanner;

/**
 * Write a description of class WaterLevelMonitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaterLevelMonitor
{
    public static void main(String[]arg)
    {
        Scanner S=new Scanner(System.in);
        System.out.println("Write the Water level:");
        double liters=S.nextDouble();
        String threshold=(liters<1000)?"Status:normal":"Status:WARNING";
        System.out.println(threshold );
        
    
        
        
    }
}