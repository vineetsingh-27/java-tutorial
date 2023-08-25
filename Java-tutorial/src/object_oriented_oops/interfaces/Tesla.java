package object_oriented_oops.interfaces;

public class Tesla {
    private Engine engine;
    private Media media = new CDPlayer();

    public Tesla() {
        engine = new ElectricEngine();
    }

    public Tesla(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void upgradeEngine(){
        this.engine = new PowerEngine();
    }


}
