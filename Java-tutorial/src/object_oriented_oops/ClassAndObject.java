package object_oriented_oops;

class Car{

    int engine;
    float mileage;
    int price;
}

public class ClassAndObject {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(car.hashCode());
        System.out.println(car.engine = 1);
        System.out.println(car.mileage = 15.5f);
        System.out.println(car.price = 15);

        System.out.println("-------------");

        Car car1 = new Car();
        System.out.println(car1.hashCode());

        System.out.println(car1.engine = 2);
        System.out.println(car1.mileage = 10.3f);
        System.out.println(car1.price = 19);

        System.out.println("-------------");


        car = car1;

        System.out.println(car.engine);
        System.out.println(car.mileage);
        System.out.println(car.price);
    }
}
