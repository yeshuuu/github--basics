import java.util.Scanner;

public class IfElse {
    public static void main(String[] args)
    
    //Check whether the given number is positive or negative
   /*{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        Double x = sc.nextDouble();
        if (x>0) {
            System.out.println("The given number is Positive");            
        }
        else{
            System.out.println("The given number is Negative");
        }
    }*/

    //Check the given numbers are in increasing or decreasing order or Neither of it

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        double c = sc.nextDouble();

        if(a<b && b<c){
            System.out.println("The given numbers are in increasing order");
        }
        else if(a>b && b>c){
            System.out.println("the given numbers are in decreasing order");
        }
        else{
            System.out.println("Neither is in Increasing or Decreasing order");
        }
        sc.close();
    }   
}
