package Assignment_3_1;

public class Person implements RepkaItem {
    private String name;
    private String namePadezh;

    public Person(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    public String getName() {
        return name;
    }

    public String getNamePadezh() {
        return namePadezh;
    }

    public void pull(Person person) {
        System.out.println(name + " za " + person.getNamePadezh());
    }
}
