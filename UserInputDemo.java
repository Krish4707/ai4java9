import java.util.Scanner;

/**
 * Write a description of class UserInputDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserInputDemo
{
   public static void main(String[]arg)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the firstNumber");
       int firstValue=sc.nextInt();
       System.out.println("Enter the secondNumber");
       int secondValue=sc.nextInt();
            int bigger=(firstValue>secondValue)?firstValue:secondValue;
            
       int sum=firstValue+secondValue;
       System.out.println("The sum of two value"+sum);
       System.out.println("The bigger of two value"+bigger);
       
       
   }
}