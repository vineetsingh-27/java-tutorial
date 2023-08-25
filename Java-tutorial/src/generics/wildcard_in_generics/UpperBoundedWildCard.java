package generics.wildcard_in_generics;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildCard {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5,4);
        System.out.println(add(list));

        List<Double> list1 = Arrays.asList(5.5,4.5);
        System.out.println(add(list1));
    }

    public static double add(List<? extends Number> list){
        double sum = 0.0;

        for (Number num : list){
            sum +=num.doubleValue();
        }
        return sum;
    }
}
