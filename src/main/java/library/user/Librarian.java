package library.user;

public class Librarian extends User {

    public Librarian(String name) {
        super(name);
    }

    public void performRole() {
        System.out.println("Librarian " + name + " manages the library.");
    }
}