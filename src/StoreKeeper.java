import java.util.Scanner;

public class StoreKeeper {
    private final Store store;

    public StoreKeeper(Store store) {
        this.store = store;
    }

    public void run() {
        System.out.println("============================================");
        System.out.println(String.format("Welcomes to %s", store.getName()));
        System.out.println("============================================");

        while (true) {
            System.out.print("1.List Items\n2.Reserve Item\n3.Return Item\n4.Exit\n");
            System.out.print("Enter a number>");
            Scanner input = new Scanner(System.in);
            int option = input.nextInt();
            switch (option) {
                case 1:
                    this.store.listItems();
                    break;
                case 2:
                    System.out.print("Enter ID number");
                    int inputId = input.nextInt();
                    this.store.reserveItem(inputId);
                    break;
                case 3:
                    System.out.print("Enter Return ID number");
                    int inputReturnId = input.nextInt();
                    this.store.returnItem(inputReturnId);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter a valid menu Option.");
            }
        }

    }
}
