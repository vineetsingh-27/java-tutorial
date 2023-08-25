package functionAndMethod;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        change(arr);
        /**
         * Here the value will change because if you make change to the object
         * using the reference variable the same object will also change.
        * */
        System.out.println(arr[0]);

    }

    static void change(int[] num) {

        num[0] = 99;
    }
}
