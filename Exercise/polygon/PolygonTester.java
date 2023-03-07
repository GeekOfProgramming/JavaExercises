import java.util.Scanner;
import java.util.Locale;
import java.util.NoSuchElementException;
/**
  * Test class of the classes that implement convex polygons
  * @see MyTetragon
  * @see MyRectangle
  * @see MySquare
  * @see MyTriangle
  *
  * @author A. luchetta
  * @version 27-Nov-2019
  */
public class PolygonTester
{
   public static void main(String[] args)
   {
      // constants
      final char COMMENT_CHARACTER = '*';
      final int POINTS_MAX_NUMBER = 4;
      final String DELIMITERS = " ()";

      // creation of a sorted container
      SortedContainer a = new SortedContainer();

      // reading data from standard input
      Scanner in = new Scanner(System.in);
      System.out.println("Data readout:");

      int lineNumber = 0;
      while (in.hasNextLine())
      {
         lineNumber++;
         String line = in.nextLine();
         System.out.println("line " + lineNumber + " " + line);
         
         if (line.charAt(0) != COMMENT_CHARACTER)
         {
   	        Scanner tok = new Scanner(line);
   	        tok.useDelimiter("[" + DELIMITERS + "]+");
   	        tok.useLocale(Locale.US);
   	        
   	        MyPoint2D[] p = new MyPoint2D[POINTS_MAX_NUMBER];

            int i = 0;
            while (tok.hasNextDouble())
               p[i++] = new MyPoint2D(tok.nextDouble(), tok.nextDouble());
               
            // risizing to get a full array
            MyPoint2D[] q = new MyPoint2D[i];
            for (int j = 0; j < q.length; j++)
               q[j] = p[j];              
            p = q;
            
            Polygon poly = null;
            if (p.length == 3)
               poly = new MyTriangle(p);
            else if (p.length == 4)
            {
               poly = new MyTetragon(p);
               MyTetragon tetra = (MyTetragon)poly;
               
               if (tetra.isRectangle())
                  poly = new MyRectangle(p); 
               else if (tetra.isSquare())
                  poly = new MySquare(p);                             
            }
            else
               System.out.println(">>> Format error at line " + lineNumber);     
            
            if (poly != null)
               a.add(poly);        
         }
      }

      // printing of polygon on standard output in ascending order
      System.out.println();
      System.out.println("Polygons");
      while (!a.isEmpty())
         System.out.println(a.removeMax());
   }
}






