package Exercise.Animal;

public class Cat extends Mammal {

    public Cat(String aName) {
        super(aName);
    }

    public void greets() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }
}