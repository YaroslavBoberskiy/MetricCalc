import java.util.LinkedList;

public class Playlist {

    private String name;
    private LinkedList<Track> playlist;

    public Playlist(String name) {
        this.name = name;
        playlist = new LinkedList<Track>();
    }

}
