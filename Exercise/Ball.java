public class Ball {

    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction) {
        setX(x);
        setY(y);
        setRadius(radius);
        setXDelta(speed);
        setYDelta(-direction);
    }

    // Getter and Setter X
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    // Getter and Setter Y
    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    // Getter and Setter radius
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // Getter and Setter Delta X
    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    // Getter and Setter Delta Y
    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    // Move X and Y
    public void move() {
        setX(getXDelta() + getX());
        setY(getYDelta() + getY());
    }

    public void reflectHorizontal() {
        setXDelta(-getXDelta());
    }

    public void reflectVertical() {
        setYDelta(-getYDelta());
    }

    public String toString() {
        return "Ball[(" + x + "," + y + ")" +
                ",speed=(" + xDelta + "," + yDelta + ")]";
    }
}