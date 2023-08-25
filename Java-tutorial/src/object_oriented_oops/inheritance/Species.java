package object_oriented_oops.inheritance;

class Animal{
    String name;
    int age;
    boolean run = true;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Dog extends Animal{
    boolean vaccinated;
    boolean run = false;

    public Dog(String name, int age, boolean vaccinated) {

        /**
         * this keyword use to access current class instance variable,method,constructor
         **/

        /**
         * Super keyword use to access parent class instance variable,method,constructor
         **/

        super(name, age);
        this.vaccinated = vaccinated;

        System.out.println(name + " " + vaccinated);
        System.out.println("from dog class: " + this.run);
        System.out.println("from Animal class: " + super.run);
    }
}

public class Species{
    public static void main(String[] args) {

        //Parent class cannot access properties and method from child class
        Animal animal = new Animal("animal",20);
        //System.out.println(animal.vaccinated);

        //Child class can access properties and method from parent class
        Dog dog = new Dog("Moti",18,false);

        //System.out.println(dog.vaccinated = true);
        //System.out.println(dog.name = "Sheru");
        //System.out.println(dog.age = 8);

        /**
         * Cannot create an object of parent class using reference type of child class
        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. Dog
        // hence, you should have access to vaccinated variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
         **/

//        Dog dog1 = new Animal();
//        System.out.println(dog1);

    }
}

