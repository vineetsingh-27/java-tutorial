package object_oriented_oops;

public class FinalKeyword {
    public static void main(String[] args) {
        final int bonus = 10;
        //cannot change variable when declared final
        // bonus = 20;

       MyClass myClass = new MyClass();
       System.out.println(myClass.roll = 20);

       MyClass myClass1;
       for (int i=0;i<1000000000;i++){
            myClass = new MyClass();
       }

    }
}

class MyClass{
    int roll = 10;
    MyClass(){

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object destroyed");
    }
}