public class loops{
   public static void main(String[] args){
      int[] arr = {2, 0, 1, 3};
      for (int el : arr){
         System.out.println(el);
      }
      //The last is the same than:
      for (int i = 0; i < arr.length; i++){
         int el = arr[i];
	 System.out.println(el);
      }
      int j;
      for (j = 0; j < 5; j++){
         if (j >= 2){
	    break;
	 }
	 System.out.println("Yuhu");
      }
      System.out.println(j);
      for (j = 0; j < 5; j++){
         if (j >= 3){
	    break;
	 }
	 System.out.println("Yuhu");
	 if (j >= 1){
	    continue;
	 }
	 System.out.println("Tata");
      }
      System.out.println(j);
   }

}
