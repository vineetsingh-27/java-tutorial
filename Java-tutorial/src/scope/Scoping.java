package scope;

public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        /** Block Scope*/
        {
            /**
             * a is already declared outside
             * int a = 20;
             */

            a = 20;
            System.out.println("Value of a " + a);

            int b = 11;
            System.out.println("Value of b " + b);
        }
        int b = 25;
        System.out.println("b is redeclare " + b);

        /**
         * Cannot resolve b
         * System.out.println(b);
         * */

//        System.out.println(name);

        /** Loop scope*/
        for (int i = 0;i<10;i++){
            System.out.println(i);

            /** Not declared new but reassign the value of a from above 5th line*/
            a = 100;
            System.out.println(a);
        }
//        System.out.println(i); ===> error
    }

    /** Function scope*/
    static void run(String name) {
        name = "Vineet";
    }

}
