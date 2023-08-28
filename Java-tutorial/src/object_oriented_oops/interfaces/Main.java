package object_oriented_oops.interfaces;

import object_oriented_oops.access_control.A;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.price();
        Engine engine = new Car();

//        System.out.println(engine.PRICE);
//        car.start();
//        car.brake();
//        car.stop();
//
//        car.acc();

//        CDPlayer cdPlayer = new CDPlayer();
//        cdPlayer.start();

        Tesla t = new Tesla();
//        t.start();
        t.upgradeEngine();
        t.start();
    }
}
