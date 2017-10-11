public class User {
    protected String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String password) {
        if (password == null) {
            return false;
        }
        return password.equals(this.password);
    }

    public void printUsername() {
        System.out.println(username);
    }

    public boolean checkUsername(String username) {
        if (username == null) {
            return false;
        }
        return username.equals(this.username);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}