package string;

public class StringEx {
    public static void main(String[] args) {
        String name = "Vineet";
//        System.out.println("1: " + name);

        name = "Singh";
//        System.out.println("2: " + name);

        String a = "Vineet";
        String b = "Vineet";

        System.out.println(a.equals(b));
//        System.out.println(a==b);

        String name1 = new String("Vineet");
        String name2 = new String("Vineet");

//        System.out.println(name1 == name2);


        int num1 = 10;
        int num2 = 10;
        int num3 = 10;
//        System.out.println(num1 == num3);
        num1 = 20;
//        System.out.println(num1 == num2);
    }
}
