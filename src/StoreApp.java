import java.util.LinkedList;
import java.util.List;

public class StoreApp {
    public static void main(String[] args) {
        Book book = new Book(1, "Harry potter", "J.K. Rowling", 1998);
        Book book2 = new Book(2, "Curious Incident", "J.K. Rowling", 1990);
        Movie movie = new Movie(3, "Pirates of caribbean", "jack", 1992);
        Game game = new Game(4, "Rise of Titans", "Jack", 2010);
        Game game2 = new Game(5, "New game", "New director", 2050);
        List<StoreItem> items = new LinkedList<>();
        items.add(book);
        items.add(book2);
        items.add(movie);
        items.add(game);
        items.add(game2);
        Store store = new Store("Book Store", items);

        ListItemsAction listItemsAction = new ListItemsAction(store);
        ReserveItemAction reserveItemAction = new ReserveItemAction(store);
        ExitAction exitAction = new ExitAction();

        MenuOption listItemsOption = new MenuOption(1, "List items", listItemsAction);
        MenuOption reserveItemOption = new MenuOption(2, "Reserve items", reserveItemAction);
        MenuOption exitOption = new MenuOption(3, "Exit", exitAction);

        List<MenuOption> menuOptions = new LinkedList<>();
        menuOptions.add(listItemsOption);
        menuOptions.add(reserveItemOption);
        menuOptions.add(exitOption);

        Menu menu = new Menu(menuOptions);
        StoreKeeper keeper = new StoreKeeper(store, menu);
        keeper.run();
    }
}
