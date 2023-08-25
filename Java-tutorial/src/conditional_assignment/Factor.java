package conditional_assignment;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = in.nextInt();
        int fact;

        for (int i = 1;i<=num;i++){
            if (num % i == 0){
                fact = i;
                System.out.print(fact + " ");
            }
        }
    }
}
