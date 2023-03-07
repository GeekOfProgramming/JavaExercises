package Exercise.InterfaceExercise;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double aRadius) {
        super(aRadius);
    }

    @Override
    public String toString() {
        return "ResizeableCircle(" + super.toString() + "]";
    }

    @Override
    public void resize(int aPercent) {
        radius *= aPercent / 100.0;
    }

}
