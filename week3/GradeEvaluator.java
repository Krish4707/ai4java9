package week3;
import java.util.Scanner;


/**
 * Write a description of class GradeEvaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeEvaluator
{
    public static void main(String[]arg)
    {
        Scanner S = new Scanner(System.in);

        System.out.println("Write your grade:");
        int grade = S.nextInt();
        String eval=(grade>40)?"Passed":"Failed";
        System.out.println("the student of the given marks is :"+eval);
        
            }
}