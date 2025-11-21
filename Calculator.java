import java.util.Scanner;

/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
     public static void main(String[]arg)//Question 5 starts here.
     { Scanner S = new Scanner(System.in);

        System.out.println("Write First number:");
        float firstNumber = S.nextFloat();
        System.out.println("Write Second number:");
        float secondNumber = S.nextFloat();
        float cAdd=firstNumber+secondNumber;
        System.out.println("ADDITION:"+cAdd);
        float cSubs=firstNumber-secondNumber;
        System.out.println("SUBSTRACTION:"+cSubs);
        float cMulti=firstNumber*secondNumber;
        System.out.println("MULTIPLICATION:"+cMulti);
        float cDiv=firstNumber/secondNumber;
        System.out.println("DIVITION:"+cDiv);
        float cMod=firstNumber%secondNumber;
        System.out.println("Modulus:"+cMod);
        float actual=(firstNumber>secondNumber)?firstNumber:secondNumber;
        System.out.println("Bigger Number:"+actual);
        
        
    }  
        
}       
        
        