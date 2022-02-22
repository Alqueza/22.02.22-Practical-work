public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("adilet", 19, "Java");
        programmer.personInfo();
        System.out.println();

        Programmer programmer1 = new Programmer("Kyle", 21, "Java");
        programmer1.personInfo();
        System.out.println();

        Driver driver1 = new Driver("Lektor", 35, "Police Car");
        driver1.personInfo();
        driver1.drive();
        System.out.println();

        Driver driver = new Driver("aibek", 25, "Tesla");
        driver.personInfo();
        driver.buyCar();
        System.out.println();

        Sportsman sportsman1 = new Sportsman("Anastasia", 23, "Swimmer");
        sportsman1.personInfo();
        System.out.println();

        Sportsman sportsman = new Sportsman("aidin", 19, "Football");
        sportsman.personInfo();
        System.out.println();

        Seaman seaman1 = new Seaman("Lucas", 45, "Nadejda");
        seaman1.personInfo();
        seaman1.swim();
        System.out.println();

        Seaman seaman = new Seaman("Bob", 33, "Avrora");
        seaman.personInfo();
        seaman.swim();
        System.out.println();


        Swimmable[] people = {programmer, programmer1, seaman, seaman1, sportsman, sportsman1};
        for (Swimmable a : people) {
            a.swim();
        }

            Pool pool = new Pool();
            pool.setPeople(people);
            System.out.println(pool);
        }

    }