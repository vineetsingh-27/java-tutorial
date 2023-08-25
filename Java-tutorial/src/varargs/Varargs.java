package varargs;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
//        fun(1,2,3,4,5,55,66);
        fun(11,"Vineet","Tanmay","Aman","Vikas");
    }

    static void fun(int a,String ...v){
        System.out.println(a);
        System.out.println(Arrays.toString(v));
    }
}
