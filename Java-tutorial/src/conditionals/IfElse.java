package conditionals;

public class IfElse {
    public static void main(String[] args) {
        int salary = 25001;

        if (salary > 25000){
            salary +=2000;
        }else {
            salary +=1000;
        }
        System.out.println(salary);
    }
}