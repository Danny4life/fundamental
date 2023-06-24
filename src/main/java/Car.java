public class Car extends Vehicle implements Drivable {

    // fields are used to hold the state
    String type;
    String color;
    String model;
    int speed;

    // constructor are used to create objects from the class

    public Car(String type, String color, String model) {
        this.type = type;
        this.color = color;
        this.model = model;
    }

    // methods are used to get the object behavior

    public int increaseSpeed(int increment){
        this.speed = this.speed + increment;

        return this.speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }



    public static void main(String[] args) {

        Car focus = new Car("focus", "red", "101");
        Car audi = new Car("audi", "black", "102");
        Car toyota = new Car("corolla", "white", "103");

        focus.setColor("blue");

        focus.increaseSpeed(10);
        audi.increaseSpeed(20);
        toyota.increaseSpeed(30);

        System.out.println(focus.getColor());
        System.out.println(focus.getSpeed());

    }


    @Override
    public void honks() {

    }

    @Override
    public void drive() {

    }

    @Override
    public String honk() {
        return null;
    }
}
