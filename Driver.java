import java.util.Scanner;

public class Driver {
    // Arrays of all users and admins
    private static User[] users;
    private static Admin[] admins;

    public static void main(String[] args) {
        // Call setup to load arrays with users and admins
        setup();
        Scanner scan = new Scanner(System.in);

        //User login
        User loginUser;
        String pass;
        do {
            loginUser = null;
            // Collect username and password
            System.out.println("\nUser Login");
            System.out.print("Username: ");
            String name = scan.nextLine().trim();
            System.out.print("Password: ");
            pass = scan.nextLine().trim();

            // Find correct user based on username
            for (User temp : users) {
                if (temp.checkUsername(name)) {
                    loginUser = temp;
                    break;
                }
            }
            //Attemp login, and loop on failure
        } while (loginUser == null || !loginUser.login(pass));
        System.out.print("\nUser logged in: ");
        loginUser.printUsername();

        System.out.println("--------------------");


        //Admin login
        Admin loginAdmin;
        do {
            loginAdmin = null;

            // Collect username and password
            System.out.println("\nAdmin Login");
            System.out.print("Username: ");
            String name = scan.nextLine().trim();
            System.out.print("Password: ");
            pass = scan.nextLine().trim();

            // Find correct user based on username
            for (Admin temp : admins) {
                if (temp.checkUsername(name)) {
                    loginAdmin = temp;
                    break;
                }
            }

            // Attempt login, and loop on failure
        } while (loginAdmin == null || !loginAdmin.login(pass));
        System.out.print("\nAdmin logged in: ");
        loginAdmin.printUsername();

    }

    private static void setup() {
        // Fills users and admins arrays with objects
        users = new User[5];
        for (int i = 0; i < users.length; i++) {
            users[i] = new User("user" + (i + 1), "pass");
        }
        admins = new Admin[5];
        for (int i = 0; i < admins.length; i++) {
            admins[i] = new Admin("admin" + (i + 1), "pass");
        }
    }
}