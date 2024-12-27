package library.user;

public class Member extends User {

    public Member(String name) {
        super(name);
    }

    public void performRole() {
        System.out.println("Member " + name + " borrows books.");
    }
}