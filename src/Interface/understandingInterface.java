package Interface;

class Main{
    public static void main(String[] args) {
        NiceCar car = new NiceCar();
        car.On();
        car.Off();
        car.startMusic();
        car.pauseMusic();
        car.forward();
        car.backward();
        System.out.println(" ----------------------------------------- ");
        mediaPlayer videoPlayer = new VideoPlayer();
        Engine electric = new ElectricEngine();
        car.upgradeMusicPlayer(videoPlayer);
        car.upgradeEngine(electric);
        car.On();
        car.Off();
        car.startMusic();
        car.pauseMusic();
        car.forward();
        car.backward();
    }
}
interface Engine {
    int var = 0;
    void On();
    void Off();
    int gear(int gearNumber);
}
interface movement{
    void forward();
    void backward();
}
interface mediaPlayer {
    void On();
    void Off();
}
