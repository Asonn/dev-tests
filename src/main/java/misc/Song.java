package misc;

public class Song {
    private String name;
    private Song nextSong;

    public Song(String name) {
        this.name = name;
    }

    public void setNextSong(Song nextSong) {
        this.nextSong = nextSong;
    }

    public boolean isRepeatingPlaylist() {
        Song theNextSong = nextSong;
        Song twoSongsAhead = nextSong;

        while(twoSongsAhead != null && twoSongsAhead.nextSong != null) {
            theNextSong = theNextSong.nextSong;
            twoSongsAhead = twoSongsAhead.nextSong.nextSong;

            if(theNextSong == twoSongsAhead)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");

        first.setNextSong(second);
        second.setNextSong(first);

        System.out.println(first.isRepeatingPlaylist());
    }
}