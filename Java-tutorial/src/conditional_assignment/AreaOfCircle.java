package conditional_assignment;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();
        float pi = 3.14f;
        float areaOfCircle = pi*radius*radius;

        System.out.println(areaOfCircle);
    }
}
