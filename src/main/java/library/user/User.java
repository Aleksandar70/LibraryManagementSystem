package library.user;

public abstract class User {

    protected String name;

    public abstract void performRole();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}