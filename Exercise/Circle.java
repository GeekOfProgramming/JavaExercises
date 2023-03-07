
public class Circle{
    
    private double radius = 1.0;
    private String color = "red";

    public Circle(){
        this.radius=1.0;
        this.color="red";
    }

    public Circle(double radius){
        this.radius = radius;
        this.color = "Blue" ;
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    //Getter ans Setter Radius
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    //Getter ans Setter Color
    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }
    
    // Getting Area
    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + " ,color=" + color + "]";
    }
}