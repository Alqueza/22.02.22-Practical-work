import java.util.Arrays;

public class Pool extends Person{
    private Swimmable[] people;

    public Pool(String name, int age, Swimmable[] people) {
        super(name, age);
        this.people = people;
    }

    public Pool(){

    }

    public Swimmable[] getPeople() {
        return people;
    }

    public void setPeople(Swimmable[] people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "\nБассейн" +
                "\nВ бессейне сейчас купаются:" + Arrays.toString(people);
    }
}
