public abstract class Team<T extends Team> implements Comparable<Team> {

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

    @Override
    public int compareTo(Team t) {
        if (this.rating > t.rating) {
            return 1;
        } else if (this.rating < t.rating) {
            return -1;
        } else {
            return 0;
        }
    }
}
