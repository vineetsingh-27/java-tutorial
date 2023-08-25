package object_oriented_oops.polymorphism;

public class CompileTime {

    int sum(int a, int b){
        int c = a+b;
        return c;
    }

    int sum(int a, int b, int c){
        int z = a+b+c;
        return z;
    }
    public static void main(String[] args) {
        CompileTime compileTime = new CompileTime();
        System.out.println(compileTime.sum(2,4));
        System.out.println(compileTime.sum(2,3,4));
    }
}
