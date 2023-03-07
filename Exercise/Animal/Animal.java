package Exercise.Animal;

public class Animal {

    private String name;

    public Animal(String aName) {
        this.name = aName;
    }

    @Override
    public String toString() {
        return "Animal[Name: " + name + "]";
    }
}