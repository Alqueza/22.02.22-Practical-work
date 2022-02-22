public class Seaman extends Person implements Swimmable{
    private String boatName;
    public Seaman(String name, int age, String boatName) {
        super(name, age);
        this.boatName = boatName;
    }

    public Seaman() {
    }

    public String getBoatName() {
        return boatName;
    }

    public void setBoatName(String boatName) {
        this.boatName = boatName;
    }

    @Override
    public void swim() {
        System.out.println(name+" поплыл.");
    }

    @Override
    public void personInfo() {
        System.out.println("\nИмя:"+name+"\nВозраст:"+age+"\nНазвание корабля:"+boatName);
    }

    @Override
    public String toString() {
        return "Seaman{" +
                "boatName='" + boatName + '\'' +
                '}';
    }
}
