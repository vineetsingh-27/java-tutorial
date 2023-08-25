package static_example;

public class Human {
    String name;
    int age;
    int salary;
    static long population;

    public Human(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        Human.population +=1;
    }

    public static void main(String[] args) {
        Human human = new Human("Vineet",22,10000);
        System.out.println(Human.population);
    }
}
