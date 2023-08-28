package object_oriented_oops.interfaces;

public class ElectricEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Starting electric engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop electric engine");
    }

    @Override
    public void acc() {
        System.out.println("Accelerating electric engine");
    }
}
