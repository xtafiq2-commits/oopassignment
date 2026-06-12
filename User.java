// User.java
// Represents a registered user of the Expense Tracker application.

public class User {
    private String username;
    private String password;
    private String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email    = email;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getEmail()    { return email; }

    // Serialise to one CSV line for users.txt
    @Override
    public String toString() {
        return username + "," + password + "," + email;
    }
}
