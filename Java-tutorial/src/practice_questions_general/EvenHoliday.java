package practice_questions_general;

public class EvenHoliday {
    public static void main(String[] args) {
        int month = 31;
        int count = 0;
        for (int i = 1; i <= month; i++) {
            if (i % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
