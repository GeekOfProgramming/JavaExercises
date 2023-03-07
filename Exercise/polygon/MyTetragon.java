

public class MyTetragon extends Polygon {
    
    public MyTetragon(MyPoint[] p){
        this(p[0], p[1], p[2], p[3]);
    }

    /*  
      *  p1- first vertex of the quadrilateral
      *  p2- second vertex of the quadrilateral
      *  p3- third vertex of the quadrilateral
      *  p4- fourth vertex of the quadrilateral
    */
    public MyTetragon(MyPoint p1, MyPoint p2, MyPoint p3, MyPoint p4){

    }

    /*
      *  calculate the area of ​​the quadrilateral
      *  Specified by:
      *      areain interfacePolygon
      *  Specified by:
      *     areain classMyPolygon
      *  Returns:
      *      the area of ​​the quadrilateral
   */
    public double area(){
        return null;
    }

    /*
      *  check if it's a rectangle
      *  Returns:
      *  true if it is a rectangle, false otherwise
    */
    public boolean isRectangle(){
        return true;
    }

    /*
     *  check if it is a square
     *  Returns:
     *  ltrue if it is a square, false otherwise
     */
    public boolean isSquare(){
        return true;
    }

}
