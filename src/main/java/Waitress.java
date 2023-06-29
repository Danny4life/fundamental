public class Waitress extends Person{
    public Waitress(String name) {
        super(name);
    }

    public String serveStarter(String starter){
        return "serving " + starter;
    }
}
