//Properly inherit classes:
//        • of man from being;
//• Java developer - from a human.
//Remove duplicate methods.
//        Requirements:
//        • The Human class must inherit from the Entity class.
//        • The JavaDeveloper class must inherit from the Human class.
//        • There should be no duplicate methods.

package Assignment_2_3;

public class Task_4 {
    public class Entity {
        public void move() {
            System.out.println("I'm moving.");
        }

        public void eat() {
            System.out.println("I'm eating.");
        }

        public void speak() {
            System.out.println("I can communicate.");
        }
    }


    public class Human extends Entity {
        public void talk() {
            System.out.println("I can talk!");
        }
    }

    public class JavaDeveloper extends Human {
        public void code() {
            System.out.println("I know how to communicate in Java.");
        }
    }
}

