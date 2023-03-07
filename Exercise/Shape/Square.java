public class Square extends Rectangle {

    public Square() {
    }

    public Square(double aSide) {
        super(aSide, aSide);
    }

    public Square(double aSide, String aColor, boolean aFilled) {
        super(aSide, aSide, aColor, aFilled);
    }

    public double getSide() {
        return super.getWidth() + super.getLength();
    }

    public void setSide(double aSide) {
        super.setWidth(aSide);
        super.setLength(aSide);
    }

    @Override
    public void setWidth(double aSide) {
        super.setWidth(aSide);
    }

    @Override
    public void setLength(double aSide) {
        super.setLength(aSide);
    }

    @Override
    public String toString() {

        return "Square[" + super.toString() + "]";
    }

}
