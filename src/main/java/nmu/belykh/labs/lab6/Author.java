package nmu.belykh.labs.lab6;

public class Author {
    private String name;
    private int age;
    public enum Sex{
        MALE, FEMALE
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        if (age != author.age) return false;
        if (!name.equals(author.name)) return false;
        return sex == author.sex;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + sex.hashCode();
        return result;
    }
}
