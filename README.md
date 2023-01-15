## Welcome to the Learn-Java- wiki!
## Installing Eclipse on Linux:
```
sudo dnf install -y java-17-openjdk-devel
java -version
```
**Output**
```
openjdk version "17.0.3" 2022-04-19
OpenJDK Runtime Environment 21.9 (build 17.0.3+7)
OpenJDK 64-Bit Server VM 21.9 (build 17.0.3+7, mixed mode, sharing)
```
```
wget https://mirror.umd.edu/eclipse/oomph/epp/2022-03/R/eclipse-inst-jre-linux64.tar.gz
```
```
tar -xzvf eclipse-inst-jre-linux64.tar.gz
```
```
cd eclipse-installer/
./eclipse-inst
```
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

---


### Compute_CircleArea.java
**Code:**
```Java
public class Main {
   public static void main(String[] args){
   
   double r;
   double Area;
   double pi;
   
   r = 23;
   pi = 3.14159;
   Area = r*r * pi;
   
   System.out.println("Area of a Circle is\n" +Area);
   
   }

}
```
This is a Java program that calculates the area of a circle with a radius of 23 and outputs the result to the console. The variable "r" is used to store the radius of the circle, "pi" is used to store the value of pi (3.14159 in this case), and "Area" is used to store the calculated area of the circle (r*r * pi). The program then uses the "System.out.println" method to output the message "Area of a Circle is" followed by the calculated area of the circle.

---

### Compute_CircleArea_input.java
**Code:**
```Java
import java.util.Scanner;

public class Main {
   public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);
   double r;
   double Area;
   double pi;
   
   
   pi = 3.14159;
   
   System.out.println("Enter radius: ");
   r = input.nextDouble();
   Area = r*r * pi;
   
   System.out.println("Area of a Circle is\n" +Area);
   
   }

}
```
This Java program calculates the area of a circle based on user input. The program uses the Scanner class to take input from the user. The variable "r" is used to store the radius of the circle entered by the user, "pi" is used to store the value of pi (3.14159 in this case), and "Area" is used to store the calculated area of the circle (r*r * pi). The program first prompts the user to "Enter radius: " and then assigns the value entered by the user to the variable "r" using the nextDouble() method of the Scanner class. Then it calculates the area of the circle and prints the message "Area of a Circle is" followed by the calculated area of the circle using the "System.out.println" method.

---

### Compute_mean_input.java
**Code:**

```Java
import java.util.Scanner;
public class Main {
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();
    
    int mean = (num1+num2+num3)/3;
    System.out.println("The mean value is:  " +mean);
    
       
   }

}

```
This Java program calculates the mean of three integers entered by the user. The program uses the Scanner class to take input from the user. It declares three variables num1, num2, num3 to store the integers entered by the user. It then calculates the mean of the three integers by adding the three integers and dividing by 3. The result is stored in the variable "mean". The program then uses the "System.out.println" method to output the message "The mean value is: " followed by the calculated mean value.

---
### applets.java
**Code:**

```Java
// A Hello World Applet
// Save file as HelloWorld.java

import java.applet.Applet;
import java.awt.Graphics;

public class Ducky extends JApplet
{
	// Overriding paint() method
	@Override
	public void paint(Graphics g)
	{
		g.drawString("Hello World", 20, 20);
	}
	
}

```
This is a Java applet program that displays the message "Hello World" on the screen. The program is a subclass of the Applet class, which is a built-in Java class for creating applets. The program overrides the paint() method of the Applet class, which is called automatically when the applet is run. Inside the paint() method, the program uses the drawString() method of the Graphics class to display the message "Hello World" at the coordinates (20, 20) on the screen. The program extends JApplet class, JApplet is a class from javax.swing package that you can use to create an Applet, but it is not the only way to create an Applet.

---

### classes.java
**Code:**
```java
public class Main{
 int x = 100;

   public static void main(String[] args){
   
     
    Main class_object = new Main();
    Main class_object_2 = new Main();
    class_object.x = 452;
    System.out.println(class_object.x);
    System.out.println(class_object.x);
   
   }

}

```
This is a Java program that creates two instances of the Main class and assigns different values to the variable 'x' of each instance. The variable x is declared as an instance variable of the Main class and is assigned an initial value of 100.

In the main method, two instances of the Main class are created using the new keyword, one is named 'class_object' and the other is named 'class_object_2'. The value of the x variable of the 'class_object' instance is then changed to 452.

Then the program uses the "System.out.println" method to output the value of the x variable of the 'class_object' instance, which is 452. And it prints the same value again.

The value of the x variable of the 'class_object_2' instance is not changed and remains as the default value of 100.

It's important to note that, in this case, the x variable is an instance variable, so each object has its own copy of the variable. Therefore, changing the value of x for one object will not affect the value of x for the other object.

---

### classes.java
**Code:**
```java
public class Main {
   String fruit = "Apples";
   String vegetable = "Carrots";
   
   int num1 = 60;
   int num2 = 45;
   
   public static void main(String[] args){
   
   Main class_object = new Main();
   System.out.println("Number of Fruits: " + class_object.fruit + " " + class_object.num1 );
   System.out.println("Number of Vegetables: " + class_object.vegetable + " " + class_object.num2 );
   
      }

}

```
This is a simple Java program that creates an instance of the Main class and prints the values of some of its variables.

The Main class has four instance variables: "fruit" which is a string variable with a value "Apples", "vegetable" which is a string variable with a value "Carrots", "num1" which is an integer variable with a value 60 and "num2" which is an integer variable with a value 45.

In the main method, an instance of the Main class is created using the new keyword, named 'class_object'. The program then uses the "System.out.println" method to output two messages, the first one is "Number of Fruits: Apples 60" and the second one is "Number of Vegetables: Carrots 45". The first message is composed by concatenating the string "Number of Fruits: " with the value of the "fruit" variable and the value of the "num1" variable using the + operator, the second message is composed by concatenating the string "Number of Vegetables: " with the value of the "vegetable" variable and the value of the "num2" variable using the + operator.

It's important to note that, the variables are instance variables and they are not static, so, in this case, the program creates an instance of the Main class to access those variables.

---

### classes.java
**Code:**
```Java
public class Main{
 int x = 100;

   public static void main(String[] args){
   
     
    Main class_object = new Main();
    Main class_object_2 = new Main();
    System.out.println(class_object.x);
    System.out.println(class_object.x);
   
   }
}
```
This is a Java program that creates two instances of the Main class and prints the value of the variable 'x' of one of the instances. The variable x is declared as an instance variable of the Main class and is assigned an initial value of 100.

In the main method, two instances of the Main class are created using the new keyword, one is named 'class_object' and the other is named 'class_object_2'.

Then the program uses the "System.out.println" method to output the value of the x variable of the 'class_object' instance, which is 100 and prints it again.

Since the variable x is an instance variable, it has a different value for each object, but in this case, the value of the variable is the same for both instances of the Main class and it is not modified inside the main method, so the two System.out.println lines will print the same value, which is 100.

---
### condtions.java
**Code:**

```java
public class Main {
  public static void main(String[] args) {
  
  if (21 <= 20)
  {
  System.out.println(true);
  } else if (21 >= 21){
  System.out.println(false);
  }
  
  }

}

```
This code defines a class "Main" that contains a "main" method. Inside the main method, an "if-else" statement is used to check if 21 is less than or equal to 20. If this evaluates to true, the program prints "true" to the console. If not, it then checks if 21 is greater than or equal to 21, if so it will print "false" to the console.

The if condition will never be true, so the program will only output "false"

---

### for.java
**Code:**

```java
public class Main{
   public static void main(String[] args) {
    for (int i = 0; i < 10; i++)
     System.out.println(i);
     
     String[] fruits = {"Apple","Banana", "Orange"};
     for (String i : fruits)
     System.out.println(fruits);
    
      }
}
```
This code defines a class "Main" that contains a "main" method. Inside the main method, there are two for loops. The first for loop uses the variable "i" and iterates from 0 to 9, printing the value of "i" to the console on each iteration.

The second for loop is an enhanced for loop, also known as a "for-each" loop, which is used to iterate over an array or collection. It uses the variable "i" to iterate through the "fruits" array, and on each iteration, it prints the value of "i" to the console.

However, the second for loop, the print statement is using System.out.println(fruits); instead of System.out.println(i); which will print the whole array ["Apple","Banana", "Orange"] in each iteration instead of the current element.

---

### forbreak.java
**Code:**
```java
public class Main{
  public static void main(String[] args){

int i = 0;
while (i < 10) {
  if (i == 4) {
    i++;
    continue;
  }
  System.out.println(i);
  i++;
}
}

}
```
This code defines a class "Main" that contains a "main" method. Inside the main method, there is a "while" loop. The loop uses the variable "i" as the loop counter and it starts with the value of 0. The loop continues to execute as long as the value of "i" is less than 10.

Inside the loop, there is an "if" statement that checks if the value of "i" is equal to 4. If this evaluates to true, the program increases the value of "i" by 1 and then uses the "continue" statement to skip the rest of the current iteration of the loop, and move to the next iteration.

If the value of "i" is not equal to 4, the program will print the value of "i" to the console and then increase the value of "i" by 1.

In summary, this program will print the numbers from 0 to 9 to the console, except for the number 4, which will be skipped.

---

### forloop.java
**Code:**

```java
public class Main{
   public static void main(String[] args) {
         
     String[] fruits = {"Apple","Banana", "Orange"};
     for (String i : fruits)
     System.out.println(fruits);
       
   }
}

```
This code defines a class "Main" that contains a "main" method. Inside the main method, there's an enhanced for loop, also known as a "for-each" loop, which is used to iterate over an array or collection.
It uses the variable "i" to iterate through the "fruits" array, and on each iteration, it prints the whole array ["Apple","Banana", "Orange"] using the statement System.out.println(fruits);. The current element 'i' is not being used inside the print statement.

It will print the same array 3 times on the console, instead of the current element of the array which is the expected output, to print the current element you should use System.out.println(i);

---

### forloop_2.java
**Code:**
```java
public class Main {
	public static void main(String[] args){
	for (int k = 0; k < 5; k++ )
		System.out.println("numbers"  +k);
		
	}
}

```
This code defines a class "Main" that contains a "main" method. Inside the main method, there is a for loop that uses the variable "k" as a loop counter. The loop starts with the value of "k" as 0 and continues to execute as long as "k" is less than 5.
On each iteration, it prints the string "numbers" concatenated with the current value of k using the statement System.out.println("numbers" +k);. So the output will be "numbers0", "numbers1", "numbers2", "numbers3" and "numbers4"

This program will print the numbers from 0 to 4 on the console with the string "numbers" before each number.

---

### forloop_MathAdd.java
**Code:**
```java
public class Main {
	public static void main(String[] args){
	
	int add = 0;
	for (int k = 0; k < 5; k++ ){
			
		add = add + k;
	
	}

	System.out.println("numbers: "  +add);
	}
}

```
This code defines a class "Main" that contains a "main" method. Inside the main method, there is a for loop that uses the variable "k" as a loop counter. The loop starts with the value of "k" as 0 and continues to execute as long as "k" is less than 5.

There's an integer variable add initialized with 0, and on each iteration of the loop, the current value of "k" is added to the add variable using the statement add = add + k;

After the for loop, the program prints the final value of the add variable concatenated with the string "numbers: " using the statement System.out.println("numbers: " +add);.

This program will print the sum of numbers from 0 to 4 on the console with the string "numbers: " before the sum. The sum would be 10.

---
