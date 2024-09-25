import java.util.Scanner;

public class ScInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.printf("How are you %s?\n", name);
        String status = sc.nextLine();
        System.out.println("What is your age?");
        int age = sc.nextInt ();
        System.out.println("Thanks for the information !");
        sc.close();    
    }
    
}
