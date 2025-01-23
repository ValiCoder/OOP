//Create the Dog, Cat, and Mouse classes.
//Implement interfaces in the added classes, taking into account that:
//•A cat can move around, can eat someone, and can be eaten.
//•A mouse (Mouse) can move around and can be eaten;
//•A dog (Dog) can move around and eat someone.
//Requirements:
//• The Cat class must be declared inside the Solution class.
//• The Dog class must be declared inside the Solution class.
//• The Mouse class must be declared inside the Solution class.
//25
//• A cat can move around, can eat someone, and can be eaten.
//• A mouse (Mouse) can move around and can be eaten.
//• A dog (Dog) can move around and eat someone.

package Assignment_3_1;

public class Task_11 {
    public static void main(String[] args) {
    }

    //can move
    public interface Movable {
        void move();
    }

    //can be eaten
    public interface Edible {
        void beEaten();
    }

    // might eat someone
    public interface Eat {
        void eat();
    }

    class Dog implements Movable, Eat {

        @Override
        public void eat() {

        }

        @Override
        public void move() {

        }
    }

    class Cat implements Movable, Edible, Eat {

        @Override
        public void eat() {

        }

        @Override
        public void beEaten() {

        }

        @Override
        public void move() {

        }
    }

    class Mouse implements Movable, Edible {
        @Override
        public void move() {

        }

        @Override
        public void beEaten() {

        }
    }
}
