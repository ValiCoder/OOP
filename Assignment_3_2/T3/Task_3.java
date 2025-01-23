package Assignment_3_2.T3;
public class Task_3 {
    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperUnknown = new Skyscraper(50, "Unknown");
    }
}

class Skyscraper {
    public int floorsCount;
    public String developer;

    public Skyscraper() {
        this.floorsCount = 50;
        this.developer = "JavaRushDevelopment";

    public Skyscraper(int floorsCount, developer1) {
        this.floorsCount = floorsCount;
        this.developer = String.valueOf(developer1);
        }
    }
}


//class Cat
//{
// public static final int UNKNOWN = -1;
// public String name;
// public int age;
// public Cat(String name, int age)
// {
// this.name = name;
// this.age = age;
// }
// public Cat()
// {
// this.name = "Nameless";
// this.age = UNKNOWN; // unknown
// }
