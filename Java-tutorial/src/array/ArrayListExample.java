package array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<>(2);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

//        int[] arr = {1,1,2,2};
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 1;
        System.out.println(arr[0]);
        System.out.println(arr[1]);

//        arrayList.add(4);
//        arrayList.add(5);

//        arrayList.add(0,11);
//        System.out.println(arrayList.contains(1));

//        System.out.println(arrayList);

//        for (int i = 0; i < 5; i++) {
//            arrayList.add(sc.nextInt());
//        }
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(arrayList.get(i));
//        }
    }
}
