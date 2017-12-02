public abstract class Team<T extends Team> {

    private String name;
    private int rating;

    public Team(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }
}
