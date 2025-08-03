package Interface;

public class MovementsOfCar implements movement {

    @Override
    public void forward() {
        System.out.println("Car is Moving Forward");
    }

    @Override
    public void backward() {
        System.out.println("Car is Moving Backward");
    }
}
