package java_hw_5.Task_3;

public class Media {
    private String title;
    private int duration;

    public Media(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public void play() {

        System.out.println("Playing media");
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public void setDuration(int duration) {

        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Media: " +
                "Title: " + getTitle() + " " +
                "Duration: " + getDuration() + " minutes";
    }
}

