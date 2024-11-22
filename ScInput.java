import java.util.Scanner;

public class ScInput {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = a.next();
        a.nextLine();
        System.out.printf("How are you %s?\n", name);
        String status = a.nextLine();
        System.out.println("What is your age?");
        int age = a.nextInt();
        System.out.println("Thanks for the information !");
        a.close();    
    }
    
}
