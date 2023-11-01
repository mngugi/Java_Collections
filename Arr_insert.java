
// java code to create and insert arrays

import java.util.Arrays;
import java.util.List;



public class Main {
        public static void main(String[] args){
        
        Array nums = new Array(4);
        nums.insert(100);
        nums.insert(200);
        nums.insert(300);
        nums.insert(400);
        nums.print();
        
        nums.removeAt(2);
        
        System.out.println(nums.indexOf(400));
        
        
        }


}
