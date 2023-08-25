package practice_questions_general;

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int originalPrice = sc.nextInt();
        int discountPercentage = sc.nextInt();
        int discountedValue = 0;
        int res;
        if (originalPrice != 0){
            if (discountPercentage !=0) {
                discountedValue = originalPrice / discountPercentage;
            }
        }
        res = originalPrice - discountedValue;
        System.out.println("Your effective price after discount is : " + res);
    }
}
