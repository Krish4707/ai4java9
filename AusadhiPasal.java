import java.util.Scanner;

/**
 * Write a description of class AusadhiPasal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AusadhiPasal
{
    public static void main(String[]arg)
    {// Whole seller to pharmasist
        Scanner S=new Scanner(System.in);
        System.out.println("Write the Name of medicine(one medicine at one time):");
        String med=S.nextLine();
        System.out.println("Write the Quantity of Tablet(one medicine at one time):");
        int Qt=S.nextInt();
        System.out.println("The price of medicine per tablet is:19.56");
        
        //pharmasist to customer
        Scanner customer=new Scanner(System.in);

        System.out.println("Write the Name of medicine(one medicine at one time):");
        String name=customer.nextLine();
        System.out.println("Write the Quantity of Tablet(one medicine at one time):");
        int qn=customer.nextInt();
        double total=qn*25;
        System.out.println("The price of one tablet is 25Rs");
        System.out.println("Thankyou!Your total for the medicine is"+total);
        int left=Qt-qn;
        
        System.out.println("The left over stock of the medicine is"+left+"tablets");
        
    
    }
}