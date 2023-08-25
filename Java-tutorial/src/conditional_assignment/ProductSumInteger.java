package conditional_assignment;

public class ProductSumInteger {
    public static void main(String[] args) {
        int n = 4421;
        int prod = 1;
        int sum = 0;
        while (n>0){
            prod = prod * (n % 10);
            sum = sum + n % 10;
            n/=10;
        }
        System.out.println(prod-sum);
    }
}
