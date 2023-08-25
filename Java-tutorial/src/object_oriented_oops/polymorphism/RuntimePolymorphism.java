package object_oriented_oops.polymorphism;

class A{
    int getRateOfInterest(){
        return 0;
    }

    static void greet(){
        System.out.println("I am in greeting a");
    }
}

class B extends A{
    int getRateOfInterest(){
        return 1;
    }

    static void greet(){
        System.out.println("I am in greeting b");
    }
}

class C extends A{
    int getRateOfInterest(){
        return 2;
    }


    static void greet(){
        System.out.println("I am in greeting c");
    }
}
public class RuntimePolymorphism {
    public static void main(String[] args) {

        A a = new A();
        A b = new B();
        A c = new C();

        System.out.println(a.getRateOfInterest());
        System.out.println(b.getRateOfInterest());
        System.out.println(c.getRateOfInterest());

//        A.greet();
        b.greet();

//        C.greet();

        /**
         * Overriding depends on objects
         * static stuff does not depend on object
         * hence you cannot override static stuff but,
         * you can inherit
         * **/
    }
}
