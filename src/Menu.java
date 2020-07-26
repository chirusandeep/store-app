import java.util.List;

public class Menu {
    private final List<MenuOption> menuOptions;

    public Menu(List<MenuOption> menuOptions) {
        this.menuOptions = menuOptions;
    }

    public void print() {
        for (MenuOption option : this.menuOptions) {
            option.print();
        }
    }

    public void chooseOption(int inputOption) {
        for (MenuOption option : this.menuOptions) {
            if (option.getNumber() == inputOption) {
                MenuAction action = option.getAction();
                action.execute();
                return;
            }
        }
        System.out.println("Invalid option.");
    }
}
