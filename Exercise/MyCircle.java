public class MyCircle {

    private MyPoint center;
    private int radius = 1;

    // Defult Circle = (0,0)
    public MyCircle() {
        center = new MyPoint();
        this.radius = 1;
    }

    // Circle (x,y,radius)
    public MyCircle(int x, int y, int radius) {
        center = new MyPoint(x, y);
        this.radius = radius;
    }

    // Circle(Center(x,y),radius)
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    // setter and getter radius
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // setter and getter center(x,y)
    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    // setter and getter center(x)
    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
        center.setX(x);
    }

    // getter and setter center(y)
    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    // getter and setter center(x,y)
    public int[] getCenterXY() {
        int[] centerXY = { getCenterX(), getCenterY() };
        return centerXY;
    }

    public void setCenterXY(int x, int y) {
        center.setXY(x, y);
    }

    // toString method
    @Override
    public String toString() {
        return "MyCircle[Radius=" + radius + ", " + center + "]";
    }

    // gettir of Area
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    // getter of Circumference
    public double getCircumference() {
        double circum = 2 * Math.PI * radius;
        return circum;
    }

    // Distance between cinter of circle and and the one user want
    public double distance(MyCircle another) {
        return center.distance(another.center);
    }
}
