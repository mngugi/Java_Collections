public class Array {
        private int[] items;
        private int count;
        
        public Array(int length){
           items = new int[length];
                
        }
        public void print(){
        
           for (in i = 0; i < count; i++)
              System.out.println(items[i]);
        
        }

}
