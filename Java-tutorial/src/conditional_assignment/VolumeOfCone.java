package conditional_assignment;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();
        int height = in.nextInt();
        float pi = 3.14f;

        double volumeOfCone = pi*radius*radius*height/3;

        System.out.println(volumeOfCone);
    }
}
