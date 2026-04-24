package java_hw_5.Task_3;

public class Program {
    public static void main(String[] args) {


        Media track = new Music("Amble", 4, "Lonely Island");
        Media clip = new  Video("Lonely Island", 4, "1920x1080");

        track.play();
        clip.play();
    }

}

