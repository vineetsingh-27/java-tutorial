package object_oriented_oops.interfaces;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("start music");
    }

    @Override
    public void stop() {
        System.out.println("stop music");
    }
}
