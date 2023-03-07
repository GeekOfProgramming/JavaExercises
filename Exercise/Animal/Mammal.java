package Exercise.Animal;

public class Mammal extends Animal {

    public Mammal(String aName) {
        super(aName);
    }

    @Override
    public String toString() {
        return "Mamaml[ " + super.toString() + "]";
    }
}