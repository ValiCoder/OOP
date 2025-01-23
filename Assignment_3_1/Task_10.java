//Add Secretary and Boss interfaces to the Manager and Subordinate classes. One
//for each.
//Think about which one is which.
//Inherit the Secretary and Boss interfaces from the Person and HasManagementPotential
//interfaces so that all methods of the Manager and Subordinate classes are declared in
//some interface.
//Requirements:
//• The Manager class must implement the appropriate interface
//(Secretary or Boss).
//• The Subordinate class must implement the interface that suits it
//(Secretary or Boss).
//• The Secretary is a person (Person).
//• A Boss is a person (Person) who can get others to work hard
//(HasManagementPotential).

package Assignment_3_1;

public class Task_10 {
    public static void main(String[] args) throws Exception {
    }
    interface Person {
        void use(Person person);
        void startToWork();
    }
    interface HasManagementPotential {
        boolean inspiresOthersToWork();
    }
    interface Secretary extends Person {
    }
    interface Boss extends Person, HasManagementPotential {
    }
    class Manager implements Boss {
        public void use(Person person) {
            person.startToWork();
        }
        public void startToWork() {
        }
        public boolean inspiresOthersToWork() {
            return true;
        }
    }
    class Subordinate implements Secretary{
        public void use(Person person) {
        }
        public void startToWork() {
        }
    }
}