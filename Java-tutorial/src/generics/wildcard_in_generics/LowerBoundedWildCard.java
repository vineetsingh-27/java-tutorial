package generics.wildcard_in_generics;

import object_oriented_oops.inheritance.hirerachical_inheitance.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildCard {
    public static void main(String[] args) {
        List<Number> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add(10);
        list1.add(11);
        addNum(list2);

        list.add(5.6);
        list.add(-4);
        list.add(5.5f);
        list2.add("Hello");

    }

    public static void addNum(List<?> list){
        for (int i = 1;i<10;i++){
//            list.add(i);
        }
        System.out.println(list);
    }
}
