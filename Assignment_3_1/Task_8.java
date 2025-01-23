//In this task, you need to:
//1. Create a Person interface.
//2. Add an isAlive() method to it that checks if the person is alive or
//not.
//3. Consider what type this method should return.
//4. Create a Presentable interface.
//5. Inherit the Presentable interface from the Person interface.
//Requirements:
//• The Person interface must be declared in the Solution class.
//• The Presentable interface must be declared in the Solution class.
//• The Presentable interface must inherit from the Person interface.
//• The isAlive method must be declared in the Person interface.
//• The return value type of the isAlive method can have only two
//values.

package Assignment_3_1;

public class Task_8 {
    public static void main(String[] args) throws Exception {



    }
    public interface Person {
        boolean IsAlive();
    }
    public interface Presentable extends Person {

    }
}