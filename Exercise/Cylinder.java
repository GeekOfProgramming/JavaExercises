public class Cylinder extends Circle {

    private double height = 1.0;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = 1.0;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = 1.0;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString()
                + " height=" + height;
    }
}