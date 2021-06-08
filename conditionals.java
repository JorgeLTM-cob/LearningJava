public class conditionals{
   public static void main (String[] args){
      int a = 4;
      boolean b = a == 4;
      int c = 3;
      if (b) {
         System.out.println("It's true!");
      }
      if (a == 4){
         System.out.println("Ohhh! So a is 4!");
      }
      if (a == c) {
         System.out.println("Program should not enter here since a > c");
      } else {
         System.out.println("a is greater than c, dah!");
      }
      if (a == c) 
	 System.out.println("Another line, Wow!");
      else
	 System.out.println("Double rainbow!");

      int result = a == 4 ? 1 : 8;
      System.out.println(result);
      //This is exactly the same than typping this:
      if (a == 4) {
         result = 1;
      } else {
	 result = 8;     
      }
      System.out.println(result);
      
      String s1 = new String("Wow");
      String s2 = new String("Wow");
      String sames1 = s1;

      boolean r1 = s1 == s2;     // This is false, since s1 and s2 are not the same object
      boolean r2 = s1.equals(s2); // This is tue, since s1 and s2 are logically equals
      boolean r3 = s1 == sames1;      // This is true, since s1 and sames1 are really the SAME object
   }
}
