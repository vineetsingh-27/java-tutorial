package practise_question_method;

import java.util.Scanner;

public class GradeCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int marks = sc.nextInt();

        gradeCalculator(marks);
    }


    static void gradeCalculator(int marks){
        if (marks<40){
            System.out.println("Fail");
        } else if (marks<=50) {
            System.out.println("D");
        } else if (marks<=60) {
            System.out.println("C");
        } else if (marks<70) {
            System.out.println("B");
        } else if (marks>70 && marks<80) {
            System.out.println("A");
        } else if (marks>80 && marks<90) {
            System.out.println("A+");
        } else if (marks>90 && marks<=100) {
            System.out.println("O");
        }else {
            System.out.println("Enter valid marks");
        }
    }
}
