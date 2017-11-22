import java.util.ArrayList;

public class Album {

    private String title;
    private ArrayList<Track> tracks ;

    public Album(String name) {
        this.title = name;
        this.tracks = new ArrayList<Track>();
    }

    public void addTracksToAlbum (Track track) {
        tracks.add(track);
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Track> getTracks() {
        return tracks;
    }
}
