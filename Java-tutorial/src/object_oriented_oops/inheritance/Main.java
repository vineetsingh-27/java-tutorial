package object_oriented_oops.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box b = new Box(4.5,3.5,2.5);
//        Box b1 = new Box(b);
//        System.out.println(b1.h);

//          BoxWeight boxWeight = new BoxWeight();
//        BoxWeight boxWeight1 = new BoxWeight(2,3,4,5);
//        System.out.println(boxWeight1.l + "|" + boxWeight1.weight);
//        System.out.println(boxWeight.h + " " + boxWeight.weight);

//        BoxWeight boxWeight2 = new BoxWeight(boxWeight);

        BoxPrice boxPrice1 = new BoxPrice();
        BoxPrice boxPrice = new BoxPrice(boxPrice1);


    }
}
