//In this task, you need to:
//1. Implement the DBObject interface in the User class.
//2. Implement the initializeIdAndName method so that the program
//works and displays the following: "The user's name is Neo, id = 1".
//3. The toString method and the main method cannot be changed.
//4. Think about what the initializeIdAndName method in the User
//class should return.
//Note: the toString() and main() methods cannot be changed.
//Requirements:
//• The DBObject interface must be implemented in the User class.
//• The initializeIdAndName method must return a valid object of type
//User, the object on which the method call is made ("this" object).
//• The initializeIdAndName method should set the values of the id and
//name fields according to the parameters passed to it.
//• The program should display: "The user's name is Neo, id = 1".
//• Do not change the toString method.
//• Do not change the main method.

package Assignment_3_1;

public class Task_13 {
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
    }

    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    static class User extends Matrix implements DBObject {
        long id;
        String name;

        @Override
        public String toString() {
            return String.format("The user's name is %s, id = %d", name, id);
        }

        @Override
        public DBObject initializeIdAndName(long id, String name) {
            this.id = id;
            this.name = name;
            return this;
        }
    }
}

