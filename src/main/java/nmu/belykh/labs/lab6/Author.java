package nmu.belykh.labs.lab6;

public class Author {
    private String name;
    private int age;
    public enum Sex{
        male, female
    }
    public Sex sex;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Author(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
