

public class MyPolygon implements Polygon {

    public MyPolygon(MyPoint2D[] p) {
        this(p[0], p[1], p[2], p[3], p[4]);
    }

    public double area() {
        double a;
        double b;
        double c;
        a = ((p[1].x - p[p0].x) * (p[2].y - p[0].y)) -
                ((p[2].x - p[0].x) * (p[1].y - p[0].y));
        b = ((p[2].x - p[p0].x) * (p[3].y - p[0].y)) -
                ((p[3].x - p[0].x) * (p[2].y - p[0].y));
        c = ((p[3].x - p[p0].x) * (p[4].y - p[0].y)) -
                ((p[4].x - p[0].x) * (p[3].y - p[0].y));
        double area = a + b + c;
        return area;
    }

    public int compareTo(Polygon p) {

    }

    public double[] getLines() {

        double p1p2 = this.p[0].getDistanceFrom(p[1]);
        double p2p3 = this.p[1].getDistanceFrom(p[2]);
        double p3p4 = this.p[2].getDistanceFrom(p[3]);
        double p4p5 = this.p[3].getDistanceFrom(p[4]);
        double p5p1 = this.p[4].getDistanceFrom(p[0]);

        double[] lines = { p1p2, p2p3, p3p4, p4p5, p5p1 };

        return lines;
    }

    public MyPoint2D getPoint() {
        return p[0] + p[1] + p[2] + p[3] + p[4];
    }

    public MyPoint2D[] getPoints() {
        return this;

    }

    public double perimeter() {

        //double[] v = getLines();

        double sum = 0.0;
        fot(int i = 0 ; i < v.length-1 ; i++){
            sum +=v[i];
        }

        return sum;
    }

    @Override
    public String toString() {
        return "MyPolygon[(Points=" + p[0] + p[1] + p[2] + p[3] + p[4] + "), Area = " + area() + "]";
    }

}
