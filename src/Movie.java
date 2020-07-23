public class Movie extends StoreItem {
    private final int id;
    private final String name;
    private final String director;
    private final int year;
    private boolean isReserved;

    public Movie(int id, String name, String director, int year) {
        this.id = id;
        this.name = name;
        this.director=director;
        this.year = year;
        this.isReserved = false;
    }

    public void printDetails() {
        if (this.isReserved) {
            System.out.println(String.format("%d %s %s %s Reserved", this.id, this.director, this.director, this.year));
        } else {
            System.out.println(String.format("%d %s %s %s", this.id, this.name, this.director, this.year));
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
