public class TestShape {
    public static void main(String[] args) {

        System.out.println(" ********Testing Shape class********");
        Shape sh1 = new Shape();
        System.out.println("sh1= " + sh1);

        System.out.println("********Shape with new color and filled********");

        Shape sh2 = new Shape("Blue", true);
        System.out.println("sh2= " + sh2);

        System.out.println("********Testing setter and getters********");

        Shape sh3 = new Shape();

        sh3.setColor("yelloo");
        sh3.setFilled(false);
        System.out.println("sh3 color= " + sh3.getColor());
        System.out.println("sh3 filled= " + sh3.isFilled());

    }
}