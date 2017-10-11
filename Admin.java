public class Admin extends User {
    private int adminId;
    private static int adminCount;

    public Admin(String username, String password) {
        // Call to super (User) constructor
        super(username, password);
        adminId = ++adminCount;
    }

    // Overrides the login method from User class
    public boolean login(String password) {
        // Call to User login method (code reuse)
        if (super.login(password)) {
            System.out.println("Welcome Admin" + adminId);
            return true;
        }
        return false;
    }

    // Override printUsername from User class
    public void printUsername() {
        System.out.println("Admin" + adminId);
    }
}