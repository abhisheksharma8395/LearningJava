package Interface;

public class ElectricEngine implements Engine {

    @Override
    public void On() {
        System.out.println("Power Engine is Started");
    }

    @Override
    public void Off() {
        System.out.println("Power Engine is Stopped");
    }

    @Override
    public int gear(int gearNumber) {
        return gearNumber;
    }
}
