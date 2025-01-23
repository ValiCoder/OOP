//In this task, you need to:
//1. Create a CanMove interface with a speed method.
//2. Make speed return a value of type Double and accept nothing as
//arguments.
//3. Create and inherit the CanFly interface from the CanMove
//interface.
//4. Add a speed method to the CanFly interface.
//5. Ensure that speed returns a value of type Double and accepts one
//parameter of type CanFly.
//Requirements:
//• The CanMove interface must be declared in the Solution class.
//• The CanFly interface must be declared in the Solution class.
//• The CanFly interface must inherit from the CanMove interface.
//• The CanMove interface must declare a speed method with no
//parameters and a return value type of Double.
//• The CanFly interface must declare a speed method with one
//argument of type CanFly and return value type Double.


package Assignment_3_1;

public class Task_9 {
    public static void main(String[] args) {

    }
    public interface CanMove {
        double speed();
    }
    public interface CanFly extends CanMove {
        double speed(CanFly canFly);
    }
}
