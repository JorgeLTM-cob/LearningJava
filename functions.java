class Student{
   private String name;
   public String getName(){
      return name;
   }
   public void setName(String name){
      this.name = name;
   }
}

public class functions{
   public static void main(String[] args){
      Student s = new Student();
      s.setName("Danielle");
      String name = s.getName();
      System.out.println(name);
   }
}
