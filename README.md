# Learn-Java-

## Welcome to the Learn-Java- wiki!
### Arr.java
**Code:**
```java
import java. util.Arrays;


public class Main {
        public static void main(String[] args){
        
        int[] nums = new int[5];
        nums[0] = 100;
        nums[1] = 200;
        nums[2] = 400;
        nums[3] = 1100;
        nums[4] = 700;
        
        System.out.println(Arrays.toString(nums));
        
        
        }


}

```

This code creates an array of integers with a length of 5, and assigns values to each element in the array. The values are 100, 200, 400, 1100, and 700, respectively. The Arrays.toString() method is then used to print the contents of the array in a string format.

When you run the program, it will output the following:

`[100, 200, 400, 1100, 700]`

You can use the Arrays.sort(nums) method to sort the elements of the array in ascending order and then you can use Arrays.toString(nums) to print the sorted array.

`Arrays.sort(nums);`
`System.out.println(Arrays.toString(nums));`

After sorting the array, it will output the following:

`[100, 200, 400, 700, 1100]`

---

### Arr_insert.java
**Code:**

```java
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

```
This code defines a custom class called Array that appears to mimic the behavior of a standard array in Java. The Array class has a constructor that takes an integer value as a parameter, which is used to set the initial size of the array.

The insert() method is used to add elements to the array, and the removeAt() method is used to remove an element at a specific index.

The print() method is used to print the contents of the array.
The indexOf(400) is used to find the index of an element in the array which have the value of 400.

It should be noted that it's not a good practice to create a custom class to mimic the behavior of standard array in Java. Java already has built-in support for arrays and array-like data structures like java.util.List. There are also other libraries available in Java, such as Apache Commons Lang and Guava, which provides additional array and list utilities. It is better to use them instead of creating a custom array class.

You can use the List class to accomplish the same thing and the List class has the advantage of being a part of the Java standard library, which makes it more convenient to use and share with others.
```Java
List<Integer> nums = new ArrayList<>();
nums.add(100);
nums.add(200);
nums.add(300);
nums.add(400);
System.out.println(nums);

nums.remove(2);
System.out.println(nums);

System.out.println(nums.indexOf(400));
```
It's also easy to sort the List using the Collections.sort() method in the standard library.

`Collections.sort(nums);`

---

### Array.java
**Code:**

```Java
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
```
A basic implementation of an array class in Java. It has a private int[] variable named "items" which will be used to store the elements of the array, and a private int variable named "count" which will keep track of the number of elements in the array.

The class also has a constructor that takes an int argument "length", which is used to initialize the "items" array. And it has a public method "print" that iterates through the "items" array and prints each element on a separate line.

There is an issue with the print method though. The for loop is using "in" instead of "int" as the data type of the loop variable, which will cause a compile error. That should be fixed. Also it would be better to check if the array is empty before trying to print elements.
```java
        public void print(){
          if (count == 0) {
              System.out.println("Array is empty");
          } else {
            for (int i = 0; i < count; i++)
              System.out.println(items[i]);
          }
        }
```
Also, to make this class more usable, you may want to add methods to insert and remove elements from the array, and also a way to access the elements by index.
