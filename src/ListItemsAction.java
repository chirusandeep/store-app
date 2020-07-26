public class ListItemsAction implements MenuAction {
    private final Store store;

    public ListItemsAction(Store store) {
        this.store = store;
    }

    @Override
    public void execute() {
        this.store.listItems();
    }
}
