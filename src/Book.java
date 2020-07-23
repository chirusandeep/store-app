public class Book extends StoreItem {
    private final int id;
    private final String name;
    private final String author;
    private final int year;
    private boolean isReserved;

    public Book(int id, String name, String author, int year) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
        this.isReserved = false;
    }

    public void printDetails() {
        if (this.isReserved) {
            System.out.println(String.format("%d %s %s %s Reserved", this.id, this.name, this.author, this.year));
        } else {
            System.out.println(String.format("%d %s %s %s", this.id, this.name, this.author, this.year));
        }
    }

    public int getId() {
        return this.id;
    }

    public void reserve() {
        this.isReserved = true;
    }

    public void returnItem() {
        this.isReserved = false;
    }

}

