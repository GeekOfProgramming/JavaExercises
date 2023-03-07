package Exercise.InterfaceExercise;

public class TestResizableCircle {

    public static void main(String[] args) {

        System.out.println("*****Test ResizableCircle*****");

        ResizableCircle c1 = new ResizableCircle(2.0);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        ResizableCircle c2 = new ResizableCircle(15.0);
        c2.resize(90);
        System.out.println(c2);
    }
}