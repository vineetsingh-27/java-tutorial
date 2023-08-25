package object_oriented_oops.access_control;

class MyClass{
    int age;
    public MyClass() {
        System.out.println("Empty constructor");
    }
}
public class ObjectClass extends MyClass{
    int num;
    int gpa;

    public ObjectClass(int num, int gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    public static void main(String[] args) {
        ObjectClass objectClass = new ObjectClass(20,25);
        ObjectClass objectClass1 = new ObjectClass(20,25);

        if (objectClass.equals(objectClass1)){
            System.out.println("Equals");
        }else{
            System.out.println("Not equals");
        }

        ObjectClass objectClass2 = new ObjectClass(11,11);
        int z = objectClass2.age;
    }
}
