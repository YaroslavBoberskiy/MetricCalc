import java.util.LinkedList;

public class Playlist {

    private String name;
    private LinkedList<Track> playlist;

    public Playlist(String name) {
        this.name = name;
        playlist = new LinkedList<Track>();
    }

    public void addTrack (Track track) {
        playlist.add(track);
    }

    public LinkedList<Track> getPlaylist() {
        return playlist;
    }
}
