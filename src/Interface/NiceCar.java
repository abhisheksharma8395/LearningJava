package Interface;

public class NiceCar {
    private Engine engine;
    private mediaPlayer MediaPlayer;
    private movement movements;
    public NiceCar() {
        engine = new DieselEngine();
        MediaPlayer = new CDplayer();
        movements = new MovementsOfCar();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
        this.MediaPlayer = new CDplayer();
        movements = new MovementsOfCar();
    }

    public NiceCar(mediaPlayer MediaPlayer) {
        this.MediaPlayer = MediaPlayer;
        movements = new MovementsOfCar();
    }

    public NiceCar(Engine engine,mediaPlayer MediaPlayer) {
        this.engine = engine;
        this.MediaPlayer = MediaPlayer;
        movements = new MovementsOfCar();
    }

    public void On(){
        engine.On();
    }

    public void Off(){
        engine.Off();
    }

    public void startMusic(){
        MediaPlayer.On();
    }

    public void pauseMusic(){
        MediaPlayer.Off();
    }

    public void forward(){
        movements.forward();
    }

    public void backward(){
        movements.backward();
    }

    public void upgradeMusicPlayer(mediaPlayer MediaPlayer) {
        this.MediaPlayer = MediaPlayer;
    }

    public void upgradeEngine(Engine engine) {
        this.engine = engine;
    }
}
