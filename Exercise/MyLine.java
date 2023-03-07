public class MyLine {

    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.begin = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line: [ " + begin + ", " + end + " ]";
    }

    // get and set Begin and End
    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    // get X and Y of Begin and End
    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    // set X and Y of Begin and End
    public void setBeginX(int x) {
        begin.setX(x);
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    // set and get XY of Begin and End
    public void setBeginXY(int x1, int y1) {
        begin.setXY(x1, y1);
    }

    public int[] getBeginXY() {
        int[] beginXY = { getBeginX(), getBeginY() };
        return beginXY;
    }

    public int[] getEndXY() {
        int[] endXY = { getEndX(), getEndY() };
        return endXY;
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    // get the Length and Gradient
    public int getLength() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return Math.atan2(yDiff, xDiff);
    }
}