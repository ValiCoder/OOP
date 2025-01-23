//Fix the Fox and BigFox classes so that the program compiles.
//You don't need to create instances of the base class in this task. Do not change the main
//method.
//Requirements:
//• The Animal interface must be implemented in the Fox class.
//• Only one method should be implemented in the Fox class -
//getName().
//• The getColor() method must be declared in the Animal interface.
//• The BigFox class must be a descendant of the Fox class.
//• The Fox class must be abstract.

package Assignment_3_1;

import java.awt.*;

public class Task_17 {
    public static void main(String[] args) throws Exception {
        BigFox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        default Color getColor(){
            return Color.RED;
        }
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox.";
        }
    }

    public static class BigFox extends Fox {
        @Override
        public Color getColor() {
            return Color.RED;
        }
    }
}

