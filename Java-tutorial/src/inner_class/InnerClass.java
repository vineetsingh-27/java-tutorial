package inner_class;

public class InnerClass {
   static class InsideInnerClass{
       int age;
       public InsideInnerClass(int age) {
           this.age = age;
       }
   }

    public static void main(String[] args) {
        InsideInnerClass insideInnerClass = new InsideInnerClass(20);
        InsideInnerClass insideInnerClass2 = new InsideInnerClass(22);

        System.out.println(insideInnerClass.age);
        System.out.println(insideInnerClass2.age);

    }
}
