
public class Rectangle extends Shape {

    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double aWidth, double aLength) {
        this.width = aWidth;
        this.length = aLength;
    }

    public Rectangle(double aWidth, double aLength, String aColor, boolean aFilled) {
        super(aColor, aFilled);
        this.width = aWidth;
        this.length = aLength;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        return "Recangle[" + super.toString() + ", width= " + width
                + " ,length= " + length + "]";
    }

}
