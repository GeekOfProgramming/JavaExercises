package Exercise;

public interface Moveable {

    Object ySpeed = null;
    Object y = null;

    @Override
    public void moveUp();

    @Override
    public void moveDown();

    @Override
    public void moveLeft();

    @Override
    public void moveRight();
}
