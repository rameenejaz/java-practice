public class User {
    private int userID;
    private String name;
    public User() {
        userID=0;
        name="";
    }
    public User(int ID, String Name) {
        this.userID=ID;
        this.name=Name;

    }
    public String getName () {
        return name;
    }
    public int getID () {
        return userID;
    }
    
}