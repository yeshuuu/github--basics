import java.util.Scanner;

public class WhileLoop {

    //Print the numbers which are divisible by 7 from no's 150 to 200.
    public static void main(String[] args)
    /* {
        int i = 150;
        int j = 200;
        while (i<=j)
        {
            if (i%7==0)
            System.out.println(i);
            i++;

        }
        
    }*/

    //Print Even No's between 200 to 500
   /*{
        int i= 200, j =500;
        while (i<=j){
            if(i%2==0)
            System.out.println(i);
                    i++;
        }
    }*/



     //Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.
  {
    int count = 0;
    Scanner a = new Scanner(System.in);
    System.out.println("Enter the value for n:");
    long n = a.nextLong(); 
    while(n>0){
    n = n/10;
    count++;
    }     
    System.out.println(count);     
  }
}
