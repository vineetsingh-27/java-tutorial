package conditional_assignment;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        int height = in.nextInt();
        double areaOfTriangle = 0.5*base*height;

        System.out.println(areaOfTriangle);
    }
}
