public class Car {
    private String model;
    private CanDrive owner;

    public String getModel() {
        return model;
    }

    public CanDrive getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", owner=" + owner +
                '}';
    }
}
