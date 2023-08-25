package first_java_assignment;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Enter principal: ");
        System.out.println("Enter rate of interest: ");
        System.out.println("Enter time(in years): ");

        Scanner in = new Scanner(System.in);
        float principal = in.nextFloat();
        float rateOfInterest = in.nextFloat();
        int time = in.nextInt();

        float finalAmount = (principal*rateOfInterest*time)/100;
        System.out.println(finalAmount);
    }
}
