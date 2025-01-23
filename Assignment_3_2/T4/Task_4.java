package Assignment_3_2.T4;

public class Task_4 {

    public static class CarConcern {
        private final String manufacturer = "Lamborghini";
        private final String model;
        private final int year;
        private final String color;

        public CarConcern(String model, int year, String color) {
            this.model = model;
            this.year = year;
            this.color = color;
        }

        public CarConcern(String model, int year) {
            this.model = model;
            this.year = year;
            this.color = "Orange"; // Default value for color
        }

        public CarConcern(String model) {
            this.model = model;
            this.year = 4321; // Default value for year
            this.color = "Orange"; // Default value for color
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public String getModel() {
            return model;
        }

        public int getYear() {
            return year;
        }

        public String getColor() {
            return color;
        }

        public static void main(String[] args) {
            CarConcern car1 = new CarConcern("Aventador", 2023, "Red");
            CarConcern car2 = new CarConcern("Huracan", 2022);
            CarConcern car3 = new CarConcern("Gallardo");

            System.out.println("Car 1: Model=" + car1.getModel() + ", Year=" + car1.getYear() + ", Color=" + car1.getColor());
            System.out.println("Car 2: Model=" + car2.getModel() + ", Year=" + car2.getYear() + ", Color=" + car2.getColor());
            System.out.println("Car 3: Model=" + car3.getModel() + ", Year=" + car3.getYear() + ", Color=" + car3.getColor());
        }
    }
}
