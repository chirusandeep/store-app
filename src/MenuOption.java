public class MenuOption {
    private final int number;
    private final String description;
    private final MenuAction action;

    public MenuOption(int number, String description, MenuAction action) {
        this.number = number;
        this.description = description;
        this.action = action;
    }

    public void print() {
        System.out.println(this.number + ". " + this.description);
    }

    public int getNumber() {
        return this.number;
    }

    public MenuAction getAction() {
        return this.action;
    }
}
