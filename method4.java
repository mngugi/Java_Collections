public class Main{
   public static void main(String[] args){
      int result = sum(5);
      System.out.println(result);
   
   }
   
   public static int sum(int i){
      if (i > 0) {
        return i + sum(i -1);
      
      } else {
      
       return 0;
      }
   
   }

}
