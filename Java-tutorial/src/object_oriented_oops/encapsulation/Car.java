package object_oriented_oops.encapsulation;

import object_oriented_oops.access_control.A;

public class Car{
    private String engine = "petrol";
    private int tyre = 4;

    private void running(){
        System.out.println("running");
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getTyre() {
        return tyre;
    }

    public void setTyre(int tyre) {
        this.tyre = tyre;
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setEngine("petrol");
        car.setTyre(6);

        System.out.println(car.getEngine());
        System.out.println(car.getTyre());

        car.running();

        /**
         * Access modifier
         **/

        A a = new A();
        System.out.println(a.salary + " salary");
    }
}
