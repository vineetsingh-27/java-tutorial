package generics;

import java.util.*;

public class Generic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nVineet Singh Roll No:129\n\nOutput:\n");

        System.out.println("Enter roll no");
        int roll_no = scan.nextInt();
        GenericsClass<Integer> intObj = new GenericsClass<>(roll_no);

        System.out.println("Roll no :" + intObj.getData());
        GenericsClass<String> stringObj = new GenericsClass<>("Vineet");

        System.out.println("My name: " + stringObj.getData());
    }
}

class GenericsClass<T> {
    private T data;

    public GenericsClass(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }
}