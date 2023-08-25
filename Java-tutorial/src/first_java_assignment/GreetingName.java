package first_java_assignment;

import java.util.Scanner;

public class GreetingName {
    public static void main(String[] args) {
        System.out.println("Enter the name: ");
        Scanner input = new Scanner(System.in);

        String name = input.next();
        System.out.println("Hello " + name);
    }
}
