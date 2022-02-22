public class Driver extends Person implements CanDrive{

    private String carName;

    public Driver(String name, int age,String carName) {
        super(name, age);
        this.carName = carName;
    }

    public Driver() {
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void buyCar(){
        System.out.println(name+" хочет купить машину");
    }

    @Override
    public void drive() {
        System.out.println(name+" завел машину "+carName+" и поехал.");
    }

    @Override
    public void personInfo() {
        System.out.println("\nИмя:"+name+"\nВозраст:"+age+"\nМашина:"+carName);
    }

    @Override
    public String toString() {
        return "\nИмя:"+name;
    }
}
