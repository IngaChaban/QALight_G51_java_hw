package java_hw_5.Task_3;

public class Music extends Media {

    private String artist;

    public Music(String artist, int duration, String title) {
        super(title, duration);
        this.artist = artist;

    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Playing music " + artist +
                ": " + getTitle());
    }

    @Override
    public String toString() {
        return "Music: " +
                "Title: " + getTitle() + " " +
                "Duration: " + getDuration() + " minutes " +
                "Artist: " + artist;
    }
}

