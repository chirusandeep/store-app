import java.util.LinkedList;
import java.util.List;

public class StoreApp {
    public static void main(String[] args) {
        Book book = new Book(1, "Harry potter", "J.K. Rowling", 1998);
        Book book2 = new Book(2, "Curious Incident", "J.K. Rowling", 1990);
        Movie movie = new Movie(3, "Pirates of caribbean", "jack", 1992);
        Game game = new Game(4, "Rise of Titans", "Jack", 2010);
        List<StoreItem> items = new LinkedList<>();
        items.add(book);
        items.add(book2);
        items.add(movie);
        items.add(game);
        Store store = new Store("Book Store", items);
        StoreKeeper keeper = new StoreKeeper(store);
        keeper.run();
    }
}
