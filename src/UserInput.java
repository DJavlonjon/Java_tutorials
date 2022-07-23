import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name + "!");


        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        System.out.println("Your age is " + age);

        scanner.nextLine();
        System.out.println("What is your favourite color? ");
        String color = scanner.nextLine();


        System.out.println("Your color is " + color);






    }
}
