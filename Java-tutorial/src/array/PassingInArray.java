package array;

import java.util.Arrays;

public class PassingInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(arr));

        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] num){
        num[0] = 99;


        char s = 'a';
//        System.out.println(s);

        add(s);
//        System.out.println(s);
    }

    static void add(char s){
        s = 'b';
    }
}
