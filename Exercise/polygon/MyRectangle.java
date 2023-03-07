/**
  * implements a rectangle
  *
  * @see MyTetragon
  * @author A. Luchetta
  * @version 27-Nov-2019
  */
public class MyRectangle extends MyTetragon
{
   /**
      initializes a rectangle with the specified vertex array
      @param p the specified vertex array
      @throws java.lang.NullPointerException if p is null
      @throws java.lang.ArrayIndexOutOfBoundException if the array has less than
                   four vertices or any of the vertex is null
   */
   public MyRectangle(MyPoint2D[] p)
   {
      this(p[0], p[1], p[2], p[3]);
   }

   /**
      initializes a rectangle with the specified vertices
      @param p1 the first specified vertex
      @param p2 the second specified vertex
      @param p3 the third specified vertex
      @param p4 the forth specified vertex
      @throws java.lang.IllegalArgumentException if any of the vertices is null 
   */
   public MyRectangle(MyPoint2D p1, MyPoint2D p2, MyPoint2D p3, MyPoint2D p4)
   {
      super(p1, p2, p3, p4);

      if (!isRectangle())
         throw new IllegalArgumentException("not a rectangle");
   }
}

