class Point {
   int x, y;

   Point(){
      this(0,0);
   }
   Point (int x, int y){
      this.x = x;
      this.y = y;
   }
   void printPoint() {
      System.out.println("( " + x + " , " + y + " )");
   }
}
public class objects{
   public static void main(String[] args){
      Point p = new Point();
      p.x = 3;
      p.y = 6;
      System.out.println(p.x);
      System.out.println(p.y);
      p.printPoint();
   }
}
