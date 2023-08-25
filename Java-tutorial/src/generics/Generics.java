package generics;

import java.util.ArrayList;

public class Generics{
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("BMW");
        arrayList.add("TATA");
        String s = arrayList.get(1);
        System.out.println(s);
    }
}
