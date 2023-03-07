public class Circle extends Shape {

    private double radius = 1.0;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double aRadius) {
        this.radius = aRadius;
    }

    public Circle(double aRadius, String aColor, boolean aFilled) {
        super(aColor, aFilled);
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

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() + " ,radius= " + radius + "]";
    }

}
