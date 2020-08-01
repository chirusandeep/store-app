import java.util.Scanner;

public class LoginAction implements MenuAction {
    private final Authenticator authenticator;

    public LoginAction(Authenticator authenticator) {
        this.authenticator = authenticator;
    }

    @Override
    public void execute() {
        System.out.print("Enter Username");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        this.authenticator.authenticate(username, password);
    }
}
