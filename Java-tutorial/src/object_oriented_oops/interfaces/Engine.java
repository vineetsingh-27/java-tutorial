package object_oriented_oops.interfaces;

public interface Engine {
   int PRICE = 5000;

   /**
    * public abstract are by default
    **/
    public abstract void start();
    void stop();
    void acc();

    /**
     * public method must not have body in it
     **/
//    public void rain(){
//        System.out.println("raining");
//    }

    /**
     * We can have private, default, static method
     **/
    private void dance(){
        System.out.println("dancing");
    }

    default void price(){
        System.out.println("price of car is ₹100000");
    }

    static void fun(){
        System.out.println("I am very funny");
    }
}
