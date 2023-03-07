package Exercise.Animal;

public class Dog extends Mammal {

    public Dog(String aName) {
        super(aName);
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    @Override
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}