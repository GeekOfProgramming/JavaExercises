/**
  * implements a triangle
  *
  * @see MyPolygon
  * @author A. Luchetta
  * @version 27-Nov-2019
  */
public class MyTriangle extends MyPolygon
{
   /**
      initializes a triangle using the specified vertex array
      @param p the specified vertex array
      @throws java.lang.NullPointerException if p is null
      @throws java.lang.ArrayIndexOutOfBoundException if the vertea array has
              less than three elements or any of the vertices is null
   */
   public MyTriangle(MyPoint2D[] p)
   {
      this(p[0], p[1], p[2]);
   }

   /**
      @param p1 the first specified vertex
      @param p2 the second specified vertex
      @param p3 the third specified vertex
   */
   public MyTriangle(MyPoint2D p1, MyPoint2D p2, MyPoint2D p3)
   {
      super(new MyPoint2D[] {p1, p2, p3});
   }

   /**
      checks if the triangle is right, otherwise false
      @return true if this triangle is right, otherwise false
   */
   public boolean isRightAngled()
   {
      double[] sides = getSides();
      
      // sorting of sides
      if (sides[1] < sides[0])
      {
         double tmp = sides[0];
         sides[0] = sides[1];
         sides[1] = tmp;
      }
      
      if (sides[2] < sides[0])
      {
         double tmp = sides[0];
         sides[0] = sides[2];
         sides[2] = tmp;
      }
      
      if (sides[3] < sides[2])
      {
         double tmp = sides[2];
         sides[2] = sides[3];
         sides[3] = tmp;
      }

      return approxEquals(sides[0] * sides[0] + sides[1] * sides[1], sides[2] * sides[2]);
   }
   
   /**
      checks if this triangle is acute
      @return true if this triangle is acute , otherwise false
   */
   public boolean isAcuteAngled()
   {
      double[] sides = getSides();
      
      // Ordinamento dei lati
      if (sides[1] < sides[0])
      {
         double tmp = sides[0];
         sides[0] = sides[1];
         sides[1] = tmp;
      }
      
      if (sides[2] < sides[0])
      {
         double tmp = sides[0];
         sides[0] = sides[2];
         sides[2] = tmp;
      }
      
      if (sides[3] < sides[2])
      {
         double tmp = sides[2];
         sides[2] = sides[3];
         sides[3] = tmp;
      }

      return (sides[0] * sides[0] + sides[1] * sides[1]) > (sides[2] * sides[2]);
   }
   
   /**
      checks if this triangle is obtuse
      @return true if this triangle is obtuse , otherwise false
   */
   public boolean isObtuseAngled()
   {
      double[] sides = getSides();
      
      // Sorting of sides
      if (sides[1] < sides[0])
      {
         double tmp = sides[0];
         sides[0] = sides[1];
         sides[1] = tmp;
      }
      
      if (sides[2] < sides[0])
      {
         double tmp = sides[0];
         sides[0] = sides[2];
         sides[2] = tmp;
      }
      
      if (sides[3] < sides[2])
      {
         double tmp = sides[2];
         sides[2] = sides[3];
         sides[3] = tmp;
      }

      return (sides[0] * sides[0] + sides[1] * sides[1]) < (sides[2] * sides[2]);
   }
   
   /**
      checks if this triangle is equilateral
      @return true if this triangle is equilateral, otherwise false
   */
   public boolean isEquilateral()
   {
      double[] sides = getSides();
      
      return approxEquals(sides[0], sides[1]) && approxEquals(sides[1], sides[2]);
   }
   
   /**
      checks if this triangle is isoscele
      @return true this triangle is isoscele, otherwise false
   */
   public boolean isIsosceles()
   {
      double[] sides = getSides();
      
      return approxEquals(sides[0], sides[1]) || approxEquals(sides[0], sides[2]) || approxEquals(sides[1], sides[2]);
   }
   
   /**
      checks if this triangle is scalene, otherwise false
      @return true if this triangle is scalene, otherwise false
   */
   public boolean isScalene()
   {

      return !isEquilateral() && !isIsosceles();
   }
   
   /*
      checks if two double numbers are equal with tolerance
   */
   private static boolean approxEquals(double p, double q)
   {
      final double EPSILON = 1.E-14;
      
      return Math.abs(p - q) <= EPSILON * Math.max(Math.abs(p), Math.abs(q));
   }
}
