//Build a correct chain of inheritance of classes.
//A woman should be inherited from a man, and a man from an earthling.
//        Requirements:
//        • -
//The Woman class must inherit from the Human class.
//        • -
//The Human class must inherit from the Terran class.

package Assignment_2_3;

public class Task_2 {

    public class Woman extends Human {
    }
    public class Terran {
    }
    public class Human  extends Terran {
    }
}
