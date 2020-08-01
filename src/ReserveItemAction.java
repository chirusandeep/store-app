import java.util.Scanner;

public class ReserveItemAction implements MenuAction {
    private final Store store;

    public ReserveItemAction(Store store) {
        this.store = store;
    }

    @Override
    public void execute() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ID to reserve>");
        int inputId = input.nextInt();
        this.store.reserveItem(inputId);
    }
}
