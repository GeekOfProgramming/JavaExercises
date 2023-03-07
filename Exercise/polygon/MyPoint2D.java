

import java.util.Locale;

/**
 * defines a point in the Cartesian plane
 *
 * @author Adriano Luchetta
 * @version 25-10-2017
 */
public class MyPoint2D {
   // instance variables
   private double x; // x coordinate
   private double y; // y coordinate

   /**
    * initializes this point with the specified coordinates
    * 
    * @param aX the specified x coordinate
    * @param aY the specified y coordinate
    */
   public MyPoint2D(double aX, double aY) {
      x = aX;
      y = aY;
   }

   /**
    * computes the distance between this point and the specified point
    * 
    * @param q the sepcified point
    * @return distance between this point and the specified point
    */
   public double getDistanceFrom(MyPoint2D q) {
      double d2 = (x - q.x) * (x - q.x) + (y - q.y) * (y - q.y);
      return Math.sqrt(d2);
   }

   /**
    * computes the middlepoint between this point and the specified point
    * 
    * @param q the specified point
    * @return the middlepoint between this point and the specified point
    */
   public MyPoint2D getMidpoint(MyPoint2D q) {
      double xm = (x + q.x) / 2;
      double ym = (y + q.y) / 2;

      MyPoint2D tmp = new MyPoint2D(xm, ym);

      return tmp;
   }

   /**
    * textual description of this point in the format MyPoint2D(x, y)
    * 
    * @return textual description
    */
   public String toString() {
      return String.format(Locale.US, "MyPoint2D(%.2f, %.2f)", x, y);
   }

   /**
    * checks if this point coincides with the specified point
    * 
    * @param q the sepcified point
    * @return true if this point concides with the specified point,
    *         otherwise false
    */
   public boolean isCoincident(MyPoint2D q) {
      return approxEquals(x, q.x) && approxEquals(y, q.y);
   }

   // compares two floating point numbers
   private static boolean approxEquals(double a, double b) {
      final double EPSILON = 1E-14;

      return Math.abs(a - b) <= EPSILON * Math.max(Math.abs(a), Math.abs(b));
   }

   /**
    * moves this point and returns the new moved point
    * 
    * @param deltaX translation along the x axis
    * @param deltaY translation along the y axis
    * @return a new point derived from this point by translation
    */
   public MyPoint2D move(double deltaX, double deltaY) {
      MyPoint2D tmp = new MyPoint2D(x + deltaX, y + deltaY);

      return tmp;
   }

   /**
    * rotates this point with respect to the origin of axes and returns a new
    * rotated point
    * 
    * @param alpha rotation angle in sexagesimal degrees
    * @return a new point derived from this point by rotation
    */
   public MyPoint2D turn(double alpha) {
      final double COMPLETE_REVOLUTION_ANGLE = 360;

      double alpha60 = (alpha / COMPLETE_REVOLUTION_ANGLE) * 2 * Math.PI;

      double xr = x * Math.cos(alpha60) - y * Math.sin(alpha60);
      double yr = x * Math.sin(alpha60) + y * Math.cos(alpha60);

      MyPoint2D tmp = new MyPoint2D(xr, yr);

      return tmp;
   }
}
