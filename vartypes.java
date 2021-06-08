public class vartypes{
   public static void main(String[] args){
      int myNumber;
      myNumber = 5;
      System.out.println(myNumber);
      double d = 4.5;
      System.out.println(d);
      d = 3.0;
      float f = (float) 4.5;
      System.out.println(f);
      float flo = 4.5f; // (f is a shorter way of casting float)
      System.out.println(flo);
      char c = 'g';
      System.out.println(c);
      // Create a string with no constructor
      String s1 = new String("Who let the dogs out?");
      // Just using "" creates a string, so no need to write it the previous way.
      String s2 = " Who who who who!";
      // Java defined the operator + on strings to concatenate:
      String s3 = s1 + s2;
      System.out.println(s3);
      String s4 = "I have " + myNumber + " cookies";
      System.out.println(s4);
      boolean b = false;
      b = true;

      boolean toBe = false;
      b = toBe || !toBe;
      if (b) {
         System.out.println(toBe);
      }

      int children = 0;
//    b = children;      This does not work
//      if (children) { This does not work
//         System.out.println(toBe);
//      }
      boolean u = true;
      boolean v = false;
//      w = u + v;       This does not work
      System.out.println(u);
   }

}
