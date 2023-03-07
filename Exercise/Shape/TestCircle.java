public class TestCircle {
    public static void main(String[] args) {
        System.out.println(" ********Testing Circle class********");

        Circle c1 = new Circle();
        System.out.println("c1 = " + c1);

        System.out.println("********Circle with new radius********");
        Circle c2 = new Circle(3);
        System.out.println("c2 = " + c2);

        System.out.println("********Circle with new radius, color and filled********");
        Circle c3 = new Circle(2, "Yelloo", true);
        System.out.println("c3 = " + c3);

        System.out.println("********Testing setter and getters********");
        Circle c4 = new Circle();
        c4.setRadius(2.0);
        c4.setColor("Green");
        c4.setFilled(true);
        System.out.println("c4 radius= " + c4.getRadius());
        System.out.println("c4 color= " + c4.getColor());
        System.out.println("c4 filled= " + c4.isFilled());

        System.out.println("********Testing getter Area and Primeter********");
        Circle c5 = new Circle(3);
        System.out.println("c5 Area= " + c5.getArea());
        System.out.println("c5 Perimeter= " + c5.getPerimeter());
    }
}