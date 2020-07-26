import java.util.Scanner;

public class StoreKeeper {
    private final Store store;
    private final Menu menu;

    public StoreKeeper(Store store, Menu menu) {
        this.store = store;
        this.menu = menu;
    }

    public void run() {
        System.out.println("============================================");
        System.out.println(String.format("Welcomes to %s", store.getName()));
        System.out.println("============================================");

        // As there is an option to exit, the while loop will exit eventually!
        //noinspection InfiniteLoopStatement
        while (true) {
            this.menu.print();
            System.out.print("Enter a number>");
            Scanner input = new Scanner(System.in);
            int option = input.nextInt();
            this.menu.chooseOption(option);
        }
    }
}
