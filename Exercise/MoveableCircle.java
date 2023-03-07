package Exercise;

public class MoveableCircle implements Moveable {

    private MoveablePoint center;
    private int radius;

    public MoveableCircle(int aX, int aY, int aXSpeed, int aYSpeed, int aRadius) {
        this.center = new MoveablePoint(aX, aY, aXSpeed, aYSpeed);
        this.radius = aRadius;
    }

    /**
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle:(" + center.x + "," + center.y + ") speed=(" +
                center.xSpeed + "," + center.ySpeed + "),Radius=" + radius + ")";
    }

    @Override
    public void moveUp() {
        center.y -= center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y += center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x += center.xSpeed;
    }

}
