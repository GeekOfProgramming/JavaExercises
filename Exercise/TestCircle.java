public class TestCircle{

    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println("c1: Radius= " + c1.getRadius() + " ,Area = " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("c2: Radius= " + c2.getRadius() + " ,Area = " + c2.getArea());

        Circle c3 = new Circle();
        c3.setRadius(5.5);
        c3.setColor("Green");
        System.out.println("c3: Radius= " + c3.getRadius() + " ,color = " + c3.getColor());
        
        Circle c4 = new Circle(5.5);
        System.out.println("c4: " + c4.toString());

        Circle c5 = new Circle(6.6);
        System.out.println(c5.toString());
        System.out.println(c5);
        System.out.println("Operator '+' invokes toString() too: " + c5);

        c1.setRadius(2.2);
        System.out.println(c1);
        System.out.println("c1: radius is: " + c1.getRadius());

        // Test getArea() and getCircumference()
        System.out.printf("c1 :area is: %.2f%n", c1.getArea());
        System.out.printf("c1: circumference is: %.2f%n", c1.getCircumference());
    }
}