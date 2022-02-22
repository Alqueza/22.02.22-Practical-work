public class Main {
    public static void main(String[] args) {
        Person person = new Person("adilet",18);

        Programmer programmer = new Programmer("adilet",19,"Java");
        programmer.personInfo();
        System.out.println();

        Driver driver = new Driver("aibek",25,"Tesla");
        driver.personInfo();
        driver.drive();
        System.out.println();


        Sportsman sportsman = new Sportsman("aidin",19,"Football");
        sportsman.personInfo();
        System.out.println();

        Seaman seaman = new Seaman("Kyle",33,"Avrora");
        seaman.personInfo();
        seaman.swim();
    }
}