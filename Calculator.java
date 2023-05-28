import java.util.*;


//input n1 & n2;
//Select perticular operation
//REsult print accordinly
public class Calculator
{
 
    public static void main(String[] args)
    {
        int n1,n2,ch,quoitient,remainder;
        System.out.println("Enter two inputs");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st inputs");
        n1 =sc.nextInt();
        System.out.println("Enter 2st inputs");
        n2 =sc.nextInt();
        sc.close();
        
        System.out.println("Select operation");
        System.out.println("1-Addition: ");
        System.out.println("2-Subtract: ");
        System.out.println("3-Multipication: ");
        System.out.println("4-Division: ");
        System.out.println("Enter operation no");

        Scanner sv = new Scanner(System.in);
        System.out.println("Enter operation");
        ch=  sv.nextInt();
        sv.close();
        
        
       
        if(ch == 1)
        {
            System.out.println("Addition: "+(n1+n2));
        }
        else if(ch == 2)
        {
            System.out.println("Substraction: "+(n1-n2));
        }
        else if(ch == 3)
        {
            System.out.println("Multiplication: "+(n1*n2));
        }
        else if(ch == 4)
        {
            quoitient =n1/n2;
            remainder = n1%n2;
            System.out.println("Quoient: "+quoitient);
            System.out.println("remainder: "+remainder);
        }

    }

}