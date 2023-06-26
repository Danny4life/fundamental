public class User {

    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        User user1 = new User(1, "Alice");

        System.out.println("My name is " + user1.getName() + " " + "and my id is =" + " " +  user1.getId());
    }
}
