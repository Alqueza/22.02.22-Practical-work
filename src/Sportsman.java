public class Sportsman extends Person implements Swimmable,CanDrive{

    private String sport;

    public Sportsman(String name, int age,String sport) {
        super(name, age);
        this.sport = sport;
    }

    public Sportsman() {
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    @Override
    public void drive() {
        System.out.println(name+" водит машину.");
    }

    @Override
    public void swim() {
        System.out.println("\n"+name+" нырнул в озеро ласточкой.");
    }

    @Override
    public void personInfo() {
        System.out.println("\nИмя:"+name+"\nВозраст:"+age+"\nЗанимается спортом:"+sport);
    }

    @Override
    public String toString() {
        return "\nИмя:"+name;
    }
}
