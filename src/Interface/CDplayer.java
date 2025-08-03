package Interface;

public class CDplayer implements mediaPlayer{
    @Override
    public void On() {
        System.out.println("Media Player is Started");
    }

    @Override
    public void Off() {
        System.out.println("Media Player is Stopped");
    }
}
