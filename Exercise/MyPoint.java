public class MyPoint {

    private int x = 0;
    private int y = 0;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the {x,y}
     */
    public int[] getXY() {
        int[] point = { this.x, this.y };
        return point;
    }

    /**
     * @param set the given point to x and y
     */
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;

        return Math.sqrt(xDiff * xDiff + yDiff * xDiff);
    }

    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;

        return Math.sqrt(xDiff * xDiff + yDiff * xDiff);
    }
}