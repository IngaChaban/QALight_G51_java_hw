package java_hw_5.Task_3;

public class Video extends Media {

    private String resolution;

    public Video(String title, int duration, String resolution) {
        super(title, duration);
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public void play() {
        System.out.println("Playing video " + getTitle() +
                " in resolution " + resolution);
    }

    @Override
    public String toString() {
        return "Video:" +
                "Title: " + getTitle() + " " +
                "Duration: " + getDuration() + " minutes " +
                "Resolution: " + resolution;
    }
}

