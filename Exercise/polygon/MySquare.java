/**
  * implements a square
  *
  * @see MyRectangle
  * @author A. Luchetta
  * @version 27-Nov-2019
  */
public class MySquare extends MyRectangle
{
   /**
      initializes a square using the specified vertx array
      @param p the specified vertex array
      @throws java.lang.NullPointerException if the specified array is null
      @throws java.lang.ArrayIndexOutOfBoundException if the array has less than
              four elements
   */
   public MySquare(MyPoint2D[] p)
   {
      this(p[0], p[1], p[2], p[3]);
   }

   /**
      initializes a square with the specified vertices
      @param p1 the first specified vertex
      @param p2 the second specified vertex
      @param p3 the third specified vertex
      @param p4 the forth specified vertex
      @throws java.lang.IllegalArgumentException if any of the vertices is null 
   */
   public MySquare(MyPoint2D p1, MyPoint2D p2, MyPoint2D p3, MyPoint2D p4)
   {
      super(p1, p2, p3, p4);
      
      if (!isSquare())
         throw new IllegalArgumentException("not a square");
   }
}





