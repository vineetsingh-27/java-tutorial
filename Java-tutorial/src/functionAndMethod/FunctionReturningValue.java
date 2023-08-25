package functionAndMethod;

public class FunctionReturningValue {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }

    static int sum(){
        int a = 10;
        int b = 20;
        int c = a+b;

        //Now return will have value of c (which is addition)
        return c;

        //error unreachable statement
        //System.out.println("Hello");
    }
}
