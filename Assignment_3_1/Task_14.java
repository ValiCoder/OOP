//Rework the inheritance in classes and interfaces so that the program compiles and
//keeps doing the same thing. The Hobby
//class must implement the Desire, Dream interfaces.
//Requirements:
//• The Desire interface must be implemented in the Hobby class.
//• The Dream interface must be implemented in the Hobby class.
//• The Hobby class must contain a static INDEX variable.
//• The toString method in the Hobby class should increment and return
//the INDEX variable as a string

package Assignment_3_1;

public class Task_14 {
    public static void main(String[] args) {
        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().INDEX);
    }

    interface Desire {
    }

    interface Dream {
        public static Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Desire, Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}

