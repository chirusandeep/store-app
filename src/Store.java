import java.util.List;

public class Store {
    private final String name;
    private final List<StoreItem> items;

    public Store(String name, List<StoreItem> items) {
        this.name = name;
        this.items = items;
    }

    public void listItems() {
        for (StoreItem item : items) {
            item.printDetails();
        }
    }

    public String getName() {
        return name;
    }

    public void reserveItem(int inputId) {
        for (StoreItem item : this.items) {
            if (item.getId() == inputId) {
                item.reserve();
                return;
            }
        }
        System.out.println("Item with that Id not available!");
    }
}
