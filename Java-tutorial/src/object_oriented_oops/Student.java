package object_oriented_oops;

class Student1{
    int roll_no;
    float marks;
    String name;

    Student1(int rno, float mark, String names){
        this.roll_no = rno;
        this.marks = mark;
        this.name = names;
    }

    Student1(Student1 other){
        this.roll_no = other.roll_no;
        this.marks = other.marks;
        this.name = other.name;
    }

    Student1(){
        this(10,90.5f,"default name");
    }
}

public class Student {
    public static void main(String[] args) {
        Student1 student1 = new Student1(15,87.5f,"Vineet");
        System.out.println("My name is " + student1.name + " my age is " + student1.roll_no);

//        Student1 random = new Student1(student1);
//
//        Student1 person = new Student1();
//        System.out.println(person.name);

//        System.out.println(random.roll_no);
//        System.out.println(random.marks);
//        System.out.println(random.name);

//        System.out.println(student1.roll_no);
//        System.out.println(student1.marks);
//        System.out.println(student1.name);
    }
}
