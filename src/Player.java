import javax.annotation.processing.SupportedSourceVersion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Player {

    private static Track track1 = new Track("Track1", "Artist1", "3:11");
    private static Track track2 = new Track("Track2", "Artist2", "4:14");
    private static Track track3 = new Track("Track3", "Artist3", "4:11");
    private static Track track4 = new Track("Track4", "Artist4", "6:16");
    private static Track track5 = new Track("Track5", "Artist5", "7:17");
    private static Track track6 = new Track("Track6", "Artist6", "8:18");
    private static Track track7 = new Track("Track7", "Artist7", "9:19");
    private static Track track8 = new Track("Track8", "Artist8", "10:03");
    private static Track track9 = new Track("Track9", "Artist9", "11:23");

    private static Album album1 = new Album("Album1");
    private static Album album2 = new Album("Album2");

    private static Playlist playlist = new Playlist("Playlist");

    private static boolean directionForward = true;

    public static void main(String[] args) {
        fillTheAlbums();
        fillThePlaylist();
        //listSongs(playlist);

        ListIterator<Track> iterator = playlist.getPlaylist().listIterator();

        playNext(iterator);
        skip(iterator);
        skip(iterator);
        skip(iterator);
        playPrevious(iterator);
        playPrevious(iterator);
        playNext(iterator);
        //replayCurrent(iterator);
        //playPrevious(iterator);
        //replayCurrent(iterator);
        //replayCurrent(iterator);
        playNext(iterator);
        playNext(iterator);

        playPrevious(iterator);
        playPrevious(iterator);
        playPrevious(iterator);
        playPrevious(iterator);

    }

    public static void playNext(ListIterator<Track> iterator) {
        if (!directionForward && iterator.hasNext()) {
            iterator.next();
        }
        directionForward = true;
        if (iterator.hasNext()) {
            Track track = iterator.next();
            System.out.println(" => Now is playing " + track.getName() + " = " + track.getArtist() + " = " + track.getDuration());
        } else {
            System.out.println("= End of the Playlist reached =");
        }
    }

    public static void playPrevious(ListIterator<Track> iterator) {
        if (directionForward && iterator.hasPrevious()) {
            iterator.previous();
        }
        directionForward = false;
        if (iterator.hasPrevious()) {
            Track track = iterator.previous();
            System.out.println(" <= Now is playing " + track.getName() + " = " + track.getArtist() + " = " + track.getDuration());
        } else {
            System.out.println("= Start of the Playlist reached =");
        }
    }

    public static void skip(ListIterator<Track> iterator) {
        if (directionForward && iterator.hasNext()) {
            System.out.println("Skip " + iterator.next().getName());
        }
        if (!directionForward && iterator.hasPrevious()) {
            System.out.println("Skip " + iterator.previous().getName());
        }
    }

    public static void replayCurrent(ListIterator<Track> iterator) {
        if (!directionForward && iterator.hasNext()) {
            //directionForward = true;
            System.out.println("Replay " + iterator.next().getName());
        }
        if (directionForward && iterator.hasPrevious()) {
            //directionForward = false;
            System.out.println("Replay " + iterator.previous().getName());
        }
    }

    public static void listSongs(Playlist playlist) {
        LinkedList<Track> playlistTracks = playlist.getPlaylist();
        Iterator<Track> iterator = playlistTracks.iterator();
        while (iterator.hasNext()) {
            Track track = iterator.next();
            System.out.println(track.getName() + " = " + track.getArtist() + " = " + track.getDuration());
        }
    }

    public static void quit() {

    }

    public static void fillThePlaylist () {
        ArrayList<Track> album1Tracks = album1.getTracks();
        ArrayList<Track> album2Tracks = album2.getTracks();

        for (int i = 0; i < album1Tracks.size(); i ++) {
            playlist.addTrack(album1Tracks.get(i));
        }
        for (int i = 0; i < album2Tracks.size(); i ++) {
            playlist.addTrack(album2Tracks.get(i));
        }
    }

    public static void fillTheAlbums () {
        album1.addTracksToAlbum(track1);
        album1.addTracksToAlbum(track2);
        album1.addTracksToAlbum(track3);
        album1.addTracksToAlbum(track4);
        album1.addTracksToAlbum(track5);
        album2.addTracksToAlbum(track6);
        album2.addTracksToAlbum(track7);
        album2.addTracksToAlbum(track8);
        album2.addTracksToAlbum(track9);
    }

}
