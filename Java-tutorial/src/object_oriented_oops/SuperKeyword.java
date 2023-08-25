package object_oriented_oops;

class Age{
    int age = 20;

    Age(){
        System.out.println("Super const");
    }
}

class MyAge extends Age{
    int age;

    public MyAge(int age) {
        System.out.println(super.age + " from super");
        this.age = age;
        System.out.println(age);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Age a = new Age();

        MyAge myAge = new MyAge(30);
        System.out.println(a.age);
    }
}
