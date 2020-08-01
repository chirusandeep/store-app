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

        User user1 = new User("sand", "band");
        User user2 = new User("sand1", "band1");
        List<User> users = new LinkedList<>();
        users.add(user1);
        users.add(user2);
        Authenticator authenticator = new Authenticator(users);

        ListItemsAction listItemsAction = new ListItemsAction(store);
        ReserveItemAction reserveItemAction = new ReserveItemAction(store);
        LoginAction loginAction = new LoginAction(authenticator);
        ExitAction exitAction = new ExitAction();

        MenuOption listItemsOption = new MenuOption(1, "List items", listItemsAction);
        MenuOption reserveItemOption = new MenuOption(2, "Reserve items", reserveItemAction);
        MenuOption loginOption = new MenuOption(3, "Login", loginAction);
        MenuOption exitOption = new MenuOption(4, "Exit", exitAction);

        List<MenuOption> menuOptions = new LinkedList<>();
        menuOptions.add(listItemsOption);
        menuOptions.add(reserveItemOption);
        menuOptions.add(loginOption);
        menuOptions.add(exitOption);

        Menu menu = new Menu(menuOptions);
        StoreKeeper keeper = new StoreKeeper(store, menu);
        keeper.run();
    }
}
