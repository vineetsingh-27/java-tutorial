package type_casting;

import java.util.Scanner;

public class AutomaticTypeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         * Type casting
         * Destination type should be greater than source type
         * Left hand side should be greater than right hand side
         **/
        float num1 = sc.nextInt();

//        int num2 = sc.nextInt();
        System.out.println("Float: input"+num1);

        //Explicit type casting
//        int num1 = (int) sc.nextFloat();
//        System.out.println(num1);

        //Automatic type casting
        byte a = 101;
        byte b = 127;

        /**byte can only store maximum value of -128 to 127
         * and here multiplication of a&b is greater than 127
         * hence showing an error
         **/
        //byte c = a*b;
        //since here int can store larger value than above range, so it can be easily multiplied
        int c = a*b;
//        System.out.println(c);

        //Here int num will get ascii value of a (i.e)-97
        int num = 'a';
//        System.out.println(num);

//        int num1 = 10;
//        float num2 = 20.5f;
        double num3 = 56.6;
        byte num4 = 127;
//        System.out.println(num1*num2*num3*num4);
    }
}
