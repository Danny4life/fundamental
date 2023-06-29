public class Actress extends Person{
    public Actress(String name) {
        super(name);
    }

    public String readingScript(String movie){
        return "reading " + movie;
    }

}
