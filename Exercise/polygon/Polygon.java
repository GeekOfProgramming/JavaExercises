

/**
 * Defines a convex polygon
 * 
 * @see MyPoint2D
 *
 * @author A. Luchetta
 * @version 27-Nov-2019
 */
public interface Polygon extends Comparable<Polygon> {
   /**
    * computes the area of this convex polygon
    * 
    * @return area of this convex polygon
    */
   double area();

   /**
    * provides an array containing the sides of the polygon
    * 
    * @return array containing the sides of the polygon
    */
   double[] getSides();

   /**
    * provides the name of this convex polygon based on the number of sides<br>
    * Example: triangle, square, tetragon, pentagon, ..., n-gon
    * 
    * @return name of this polygon
    */
   String getName();

   /**
    * provides the vertex in this polygon identified with the specified index
    * 
    * @param index the specified index
    * @return the vertex of specified index
    * @throws IllegalArgumentException if the specified index is not in the
    *                                  valid range [0, n-1], where n is the number
    *                                  of the Vertices of
    *                                  this convex polygon
    */
   MyPoint2D getVertex(int index);

   /**
    * provides an array containing the sorted vertuces of this convex polygon
    * 
    * @return array containing the sorted vertices of this convex polygon
    */
   MyPoint2D[] getVertices();

   /**
    * computes the perimeter of this convex polygon
    * 
    * @return perimeter of this convex poligon
    */
   double perimeter();
}
