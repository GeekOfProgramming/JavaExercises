public class TestMyPoint1 {
    public static void main(String[] args) {
        MyPoint[] points = new MyPoint[10]; // Declare and allocate an array of MyPoint
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1, i + 1); // Allocate each of MyPoint instances
        }

        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i]);
            // Allocate each of MyPoint instances
        }
    }
}