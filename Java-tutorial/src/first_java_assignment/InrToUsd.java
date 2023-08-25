package first_java_assignment;

import java.util.Scanner;

public class InrToUsd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter amount in rupees: ");
        int inr = in.nextInt();

        float usd = inr/81.7975f;
        System.out.println("Final amount in usd: " + usd);
    }
}
