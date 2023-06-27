public class Corolla extends Toyota implements Float, Fly1{

    String color;

    void keStart(){
    }


    public String registerModel(){
        return model;
    }

    public String engineType(){
        return engine;
    }

    @Override
    public void floatOnWater() {
        System.out.println("i can float on water");
    }

    @Override
    public void flyOnAir() {
        System.out.println("i can fly on air");
    }
}
