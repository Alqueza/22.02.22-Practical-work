public class Programmer extends Person implements CanDrive,Swimmable{

    private String learnLanguage;

    public Programmer(String name, int age,String learnLanguage) {
        super(name, age);
        this.learnLanguage = learnLanguage;
    }

    public Programmer() {
    }

    public String getLearnLanguage() {
        return learnLanguage;
    }

    public void setLearnLanguage(String learnLanguage) {
        this.learnLanguage = learnLanguage;
    }

    @Override
    public void drive() {
        System.out.println(name+" сел в свою машину и поехал на работу.");
    }

    @Override
    public void swim() {
        System.out.println(name+" пошел на пляж купаться.");
    }

    @Override
    public void personInfo() {
        System.out.println("\nИмя:"+name+"\nВозраст:"+age+"\nИзучает язык:"+learnLanguage);
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "learnLanguage='" + learnLanguage + '\'' +
                '}';
    }
}
