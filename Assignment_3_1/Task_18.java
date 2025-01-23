//Let's write a program based on the fairy tale "Repka":
//1. Implement the RepkaItem interface in the Person class.
//2. In the Person class, implement a pull(Person person person)
//method that outputs a phrase like '<name> for <person>'.
//Example:
//Grandma for Grandpa
//Grandpa for Repka
//3. Fix the loop logic error in the tell method of the RepkaStory class.
//4. Execute the main method and enjoy the tale!
//Requirements:
//• The RepkaItem interface must be implemented in the Person class.
//• The Person class must implement the pull() method with one parameter of
//type Person.
//• The pull method in the Person class should output a phrase like '<name>
//for <person>'. For example: Grandma for Grandpa.
//• As a result of main() method execution, the screen should display a short
//version of the fairy tale about Repka.

package Assignment_3_1;

import java.util.ArrayList;
import java.util.List;

public class Task_18 {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<>();
        plot.add(new Person("Vnuchka", "Vnuchku"));
        plot.add(new Person("Babka", "Babu"));
        plot.add(new Person("Dedka", "Dedku"));
        plot.add(new Person("Repka", "Repku"));


        RepkaStory.tell(plot);
    }
}

interface RepkaItem {
    String getNamePadezh();
}

class RepkaStory {
    static void tell(List<Person> items) {
        for (int i = 0; i < items.size() - 1; i++) {
            Person first = items.get(i);
            Person second = items.get(i + 1);
            first.pull(second);
        }
    }
}
