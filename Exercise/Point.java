public class Point {

    private float x = 0.0f;
    private float y = 0.0f;

    public Point(float aX, float aY) {
        this.x = aX;
        this.y = aY;
    }

    public Point() {
        x = 0.0f;
        y = 0.0f;
    }

    /**
     * @return the x
     */
    public float getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public float getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float aX, float aY) {
        this.x = aX;
        this.y = aY;
    }

    public float[] getXY() {
        float[] result = new float[2];
        result[0] = this.x;
        result[1] = this.y;
        return result;
    }

    @Override
    public String toString() {
        return "\"(" + x + "," + y + ")\"";
    }
}