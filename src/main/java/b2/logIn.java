package b2;

public class logIn {

    private String username;
    private String password;
    private boolean isLoggedIn;

    public logIn(String username, String password) {
        this.username = username;
        this.password = password;
        this.isLoggedIn = false;
    }

    public boolean login() {
        // Simulate the login process
        // In a real application, this would involve checking against a database of users
        if ("handsomeguy".equals(username) && "qwerty123".equals(password)) {
            isLoggedIn = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }
}

