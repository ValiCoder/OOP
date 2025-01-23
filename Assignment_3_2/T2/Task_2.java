package Assignment_3_2.T2;

public class Task_2 {
    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperTower = new Skyscraper(50);
        Skyscraper skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
    }
}

class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILD = "Skyscraper is built.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Skyscraper is built. The number of floors - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Skyscraper is built. Developer - ";

    public Skyscraper() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }

    public Skyscraper(int floors) {
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + floors);
    }

    public Skyscraper(String developer) {
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + developer);
    }
}


/*
Let's build a new apartment complex, JavaRush Towers.
*/
//public class Skyscraper {
//    public static final String SKYSCRAPER_WAS_BUILD = "Skyscraper is built.";
//    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT =
//            "Skyscraper is built. The number of floors - ";
//    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER =
//            "Skyscraper is built. Developer - ";
//    //write your code here
//    public static void main(String[] args) {
//        Skyscraper skyscraper = new Skyscraper();
//        Skyscraper skyscraperTower = new Skyscraper(50);
//        Skyscraper skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
//    }
//}