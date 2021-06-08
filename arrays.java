public class arrays{
   public static void main(String[] args){
      int [] arr;
      arr = new int[10];
      int[] arri = {1, 2, 3, 4, 5};
      System.out.println(arr.length);
      arr[0] = 4;
      arr[1] = arr[0] + 5;
      for (int i = 0; i < arri.length; i++){
         System.out.println(arri[i]);
      }

   }

}
