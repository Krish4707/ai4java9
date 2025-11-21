import java.util.Scanner;


/**
 * Write a description of class PracticeInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PracticeInput
{
    public static void main(String[]arg)
    {
        
        {
        Scanner S = new Scanner(System.in);

        System.out.println("Write any number:");
        int number = S.nextInt();
        S.nextLine(); // to consume the leftover newline

        System.out.println("Is the number ODD or EVEN?");
        String oddeven = S.nextLine().toLowerCase(); // user input

        // Check actual condition
        String actual = (number % 2 == 0) ? "even" : "odd";

        // Compare user's answer with actual result
        if (oddeven.equals(actual)) {
            System.out.println("Correct! The given number " + number + " is " + actual + ".");
        } else {
            System.out.println("Wrong! The given number " + number + " is " + actual + ".");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        }

        
        
    
    
    }

}
