package Interface;

public class DieselEngine implements Engine{

    @Override
    public void On() {
        System.out.println("Diesel Engine is Started");
    }

    @Override
    public void Off() {
        System.out.println("Diesel Engine is Stopped");
    }

    @Override
    public int gear(int gearNumber) {
        return gearNumber;
    }
}
