package Exercise;

public class MoveablePoint implements Moveable {

    int x, y, xSpeed, ySpeed;

    public MoveablePoint(int aX, int aY, int aXSpeed, int aYSpeed) {
        this.x = aX;
        this.y = aY;
        this.xSpeed = aXSpeed;
        this.ySpeed = aYSpeed;
    }

    @Override
    public String toString() {
        return "Point:(" + x + " ," + y + " ," + xSpeed + " ," + ySpeed + ")";
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }
}