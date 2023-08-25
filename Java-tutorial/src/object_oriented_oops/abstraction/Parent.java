package object_oriented_oops.abstraction;

public abstract class Parent {

    /**
     * Abstract can have abstract as well as non-abstract methods
     * We cannot create an object of abstract class
     **/
    abstract void run();

    final int age;

    public Parent(int age) {
        this.age = age;
    }

//    public static abstract Parent(){
//        System.out.println("Abstract constructor");
//    }

    static void dance(){
        System.out.println("Hey");
    }

    void normal(){
        System.out.println("Normal method");
    }
}
