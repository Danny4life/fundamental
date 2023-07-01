public class Cars {

    private String name;
    private String model;
    private static int numberOfCars = 10;

    public Cars(String name, String model) {
        this.name = name;
        this.model = model;
        numberOfCars++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public static void setNumberOfCars(int numberOfCars) {
        Cars.numberOfCars = numberOfCars;
    }


    public static void main(String[] args) {
        Cars car1 = new Cars("toyota", "101");
        int numberOfCars1 = Cars.numberOfCars;
        System.out.println(car1.getName() + " " + car1.getModel() + " " + "has a total of " +" " + numberOfCars1 + " " + "cars.");


        Cars car2 = new Cars("camry", "102");
        int numberOfCars2 = Cars.numberOfCars;
        System.out.println(car2.getName() + " " + car2.getModel() + " " + "has a total of " +" " + numberOfCars2 + " " + "cars.");


    }
}
