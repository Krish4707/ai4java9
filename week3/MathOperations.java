package week3;
import java.util.Scanner;


/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main(String[]args)
    {
        Scanner S = new Scanner(System.in);

        System.out.println("Write any number:");
        int number = S.nextInt();
        System.out.println("Write Second number:");
        int snumber = S.nextInt();
        boolean greater=(number>snumber);
        boolean equals=(number==snumber);
        boolean notequals=(number!=snumber);
        boolean less=(number<snumber);
        System.out.println("the first number"+number+"is greaterthan"+snumber+":"+greater+"\n"+
        "the first number"+number+"is smallerthan"+snumber+":"+less+"\n"+
        "the first number"+number+"is equals to"+snumber+":"+equals+"\n"+
        "the first number"+number+"is notequals to"+snumber+":"+notequals+"\n");
        
        
        
        
    }
}