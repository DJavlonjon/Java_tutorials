import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult!");
        } else if (age >= 12) {
            System.out.println("You are a teenager!");
        } else {
            System.out.println("You are a child!");
        }

        // ternary operator
        String enter = (age > 18) ? "You can enter to the Pub" : "Sorry, you can not enter to the Pub";
        System.out.println(enter);
    }
}
