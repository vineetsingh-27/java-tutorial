package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Array of primitive
        int[] num = new int[5];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
//        System.out.println(num[4]);

        //modify the object for 0th index of an array
        num[0] = 10;
        System.out.println(num[0]);



        for (int i=0;i<5;i++){
//            num[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(num));




        //Array of objects
        String[] arr = new String[5];
        arr[0] = "Vineet";
        arr[1] = "Tanmay";
        arr[3] = "Shubham";
        arr[4] = "Vivek";

//        System.out.println(Arrays.toString(arr));
//        System.out.println();

        //Enhanced for loop (i.e) for-each loop
        for (String s : arr) {
//            System.out.println(s);
        }
        //System.out.println(arr[5]); //Index out of bound exception
    }
}
