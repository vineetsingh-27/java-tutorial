package functionAndMethod;

public class staticMethod {
    public static void main(String[] args) {
//        sum(5,3);
        System.out.println(sum(5,3));
    }

    public static int sum(int a, int b){
        int result = a+b;
        return result;
    }
}
