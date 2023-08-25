package practice_questions_general;

public class Greet {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        String name = sc.nextLine();
//        System.out.println("Hello " + name + " Good morning!");


        int num = 1234;
        int res = 0;
        while (num>0){
            int rem = num % 10;
            res = res * 10 + rem;
            num/=10;
        }
        System.out.println(res);
    }
}