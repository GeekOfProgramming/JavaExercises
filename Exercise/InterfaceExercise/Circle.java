package Exercise.InterfaceExercise;

public class Circle implements GeometricObject {

    protected double radius;

    public Circle(double aRadius) {
        this.radius = aRadius;
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("Circle with radius = %1$f", radius);
    }

    @Override
    public double getPerimeter() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getArea() {
        return 2 * radius * Math.PI;
    }

}
