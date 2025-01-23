//Implement the Animal interface in the Fox class.
//Change the code so that the Fox
//class has only one method - getName.
//Note that you cannot delete methods.
//Requirements:
//34
//• The Animal interface must be implemented in the Fox class.
//• Only one method should be implemented in the Fox class - getName.
//• The Animal's interface cannot be changed.
//• You cannot create additional classes or interfaces

package Assignment_3_1;

import java.awt.Color;

public class Task_16 {
    public static void main(String[] args) throws Exception {

    }

    public interface Animal {
        default Color getColor() {
            return Color.RED;
        }

        default Integer getAge() {
            return 5;
        }
    }

    public static class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
