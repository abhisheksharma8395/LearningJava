package Interface;

public class VideoPlayer implements mediaPlayer{

    @Override
    public void On() {
        System.out.println("VideoPlayer is Started");
    }

    @Override
    public void Off() {
        System.out.println("VideoPlayer is Stopped");
    }
}
