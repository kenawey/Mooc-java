package validating;

public class Person {

    private String name = null;
    private int age;

    public Person(String name, int age) {
        if (name==(null)||name.isBlank() || name.length() > 40 || age > 120 || age < 0) {
            throw new IllegalArgumentException();
        } else {
            this.name = name;
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
