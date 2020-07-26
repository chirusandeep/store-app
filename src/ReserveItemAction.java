import java.util.Scanner;

public class ReserveItemAction implements MenuAction {
    private final Store store;

    public ReserveItemAction(Store store) {
        this.store = store;
    }

    @Override
    public void execute() {
        Scanner input = new Scanner(System.in);
        int inputId = input.nextInt();
        this.store.reserveItem(inputId);
    }
}
