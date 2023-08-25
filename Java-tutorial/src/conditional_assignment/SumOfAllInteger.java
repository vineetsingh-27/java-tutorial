package conditional_assignment;

import java.util.Scanner;

public class SumOfAllInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true){
            System.out.print("Enter number :");
            int num = in.nextInt();

            if (num >0){
                ans +=num;
            }
            else if (num == 0){
                break;
            }
            else{
                System.out.println("Invalid number");
            }
        }
        System.out.println(ans);
    }
}
