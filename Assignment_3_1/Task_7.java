//Fix 4 errors in the program so that it compiles.
//Requirements:
//        • Variables declared in an interface can only have the widest level of
//        access (public).
//        • You can only inherit (extends) from a class: the implements keyword
//is used to implement interfaces.
//• The Hobby class must be declared with the access modifier static.
//        • You do not need to create a Dream object to access the HOBBY
//variable.
//• Don't change the interface declarations.
//public class Solution {
//    public static void main(String[] args) {
//        15
//        System.out.println(new Dream().HOBBY.toString());
//        System.out.println(new Hobby().toString()));
//    }
//    interface Desire {
//    }
//    interface Dream {
//        private static Hobby HOBBY = new Hobby();
//    }
//    class Hobby extends Desire implements Dream {
//        static int INDEX = 1;
//        @Override.
//        public String toString() {
//            INDEX++++;
//            return "" + INDEX;
//        }
//    }
//}

package Assignment_3_1;

public class Task_7 {
    public static void main(String[] args) {
        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().toString());
    }
    interface Desire {
    }
    interface Dream {
        Hobby HOBBY = new Hobby();
    }
    static class Hobby implements Desire, Dream {
        int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}
