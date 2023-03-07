public class Shape {

    private String color = "red";
    private boolean filled = true;

    public Shape() {
        color = "red";
        filled = true;
    }

    public Shape(String aColor, boolean aFilled) {
        this.color = aColor;
        this.filled = aFilled;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the filled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * @param filled the filled to set
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape[Color: " + color + " ,Filled: " + filled + "]";
    }
}