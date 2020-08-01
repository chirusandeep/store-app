import java.util.List;

public class Authenticator {
    private final List<User> usersDB;

    public Authenticator(List<User> usersDB) {
        this.usersDB = usersDB;

    }

    public void authenticate(String username, String password) {
        for (User user : this.usersDB) {
            if(user.getName().equals(username) && user.getPassword().equals(password)){
                System.out.println("Login Success");
                return;
            }
        }
        System.out.println("Invalid Username and password!");
    }
}
