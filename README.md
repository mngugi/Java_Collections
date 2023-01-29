## Welcome to the Learn-Java- wiki!
## Installing Eclipse on Linux- Debian, Fedora-Red Hat:
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
## Installing Apache NetBeans IDE using snap ->  Fedora Distro:
```Html
sudo dnf install snapd
sudo ln -s /var/lib/snapd/snap /snap
sudo snap install netbeans --classic
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

#### multiarray.java
**Code:**

```Java
public class Main {
   public static void main(String[] args){
   int[][] num = {{1,2,3,4,5,6}, {5,6,7,8,9,10}};
   for (int i = 0; i < num.length; ++i){
     for(int j = 0; j< num[i].length; ++j) {
       System.out.println(num[i][j]);
     }
   
   }
}

}

```

This Java code defines a class called "Main" that contains a main method. The main method declares a 2-dimensional array called "num" and assigns values to it. The method then uses nested for loops to iterate through the array and print each element of the array. It first loops through the outer array using the length of the array and for each outer element it loops through the inner array using the length of the inner array and prints the inner array elements.

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

### Constructor.java
**Code:**
```java

public class Main {

String construct;


public Main(){

construct = "Any string";

}

public static void main (String[] args){
     Main obj = new Main();
     System.out.println(obj.construct);

  }

}

```

This is a basic Java program that defines a class called "Main" and creates an instance of the class in the main method. The class has one instance variable called "construct" which is initialized to the string "Any string" in the constructor. In the main method, an object of the Main class is created and its "construct" variable is printed to the console using the "System.out.println" statement. The output of the program would be "Any string".

---

### ConvertCurrency_input.java
**Code:**

```Java
import java.util.Scanner;
public class Main {
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   int pound = input.nextInt();
   double one_pound = 0.454;
   double convert = pound * one_pound ; 
    
    System.out.println( +pound+  " pounds in kilograms is " +convert+ " Kilograms " );
    
         
   }

}

```

This is a Java program that uses the Scanner class to take input from the user in the form of an integer (number of pounds) and converts it to kilograms using a conversion factor. The program then prints out the result of the conversion.

Here's how the program works:

    The program imports the Scanner class from the java.util package so that it can take input from the user.
    In the main method, an object of the Scanner class is created and assigned to the variable "input".
    The program uses the nextInt() method of the Scanner class to take an integer input from the user and assigns it to the variable "pound".
    The program declares a variable "one_pound" with a value of 0.454, which is the conversion factor from pounds to kilograms.
    The program multiplies the user input (in pounds) by the conversion factor and assigns the result to the variable "convert".
    The program uses the "System.out.println" statement to print the result of the conversion to the console, along with an explanatory message.

The output of the program will be the number of pounds entered by the user and the equivalent weight in kilograms.

---

### Customer.java
**Code:**

```Java
public class Customer {
	private String Cname;
	
	
	public String getName(){
		return Cname;
	
	}

	public void setName(String newCname){
		this.Cname = newCname;	
	
	}
}

```

This is a basic Java program that defines a class called "Customer". The class has a private instance variable called "Cname" which is used to store the name of a customer. The class also has two methods:

    `getName()` which returns the value of the Cname variable and
    `setName(String newCname) which sets the value of the Cname variable to the value passed as the parameter newCname.

The getName() method allows external classes to access the private Cname variable in a controlled manner, while the setName(String newCname) method allows external classes to change the value of Cname variable.

The keyword this is used to refer to the current object's variables or methods, here it is used to refer to the instance variable Cname.

It can be used like this:


`Customer c1 = new Customer();`
`c1.setName("John");`
`System.out.println(c1.getName());`

This will output:

`John`


---

### Encapsulation_BankCustomer.java
**Code:**

```Java
public class Main {
	public static void main (String[] args){
		Customer obj = new Customer();
		obj.setName("Mutinda katungi");
		System.out.println(obj.getName());
	}
}
```
This is a Java program that creates an instance of the "Customer" class and uses its methods to set and get the customer's name.

Here's how the program works:

    The program defines a main method, which is the entry point for the program.
    Inside the main method, an object of the "Customer" class is created and assigned to the variable "obj".
    The setName method is called on the object with the string "Mutinda katungi" passed as an argument. This sets the value of the Cname variable to "Mutinda katungi".
    The getName method is called on the object, it returns the value of the Cname variable which is "Mutinda katungi" and it is printed to the console using the "System.out.println" statement.

The output of the program will be the name passed to the setName method, in this case "Mutinda katungi".

---

### Encapsulation_Customer
**Code:**

```java
public class Encapsulation_Customer {
	private String Cname;
	
	
	public String getName(){
		return Cname;
	
	}

	public void setName(String newCname){
		this.Cname = newCname;	
	
	}
}

```

This is a Java program that demonstrates encapsulation, a fundamental principle of object-oriented programming (OOP). Encapsulation refers to the practice of keeping the internal state and behavior of an object hidden from the outside world and only exposing a public interface (also called an API) for interacting with the object.

This specific program defines a class called "Encapsulation_Customer" which has a private instance variable called "Cname" which is used to store the name of a customer. The class also has two methods:

    `getName()` which returns the value of the Cname variable and
   ` setName(String newCname)` which sets the value of the Cname variable to the value passed as the parameter newCname.

The getName() method allows external classes to access the private Cname variable in a controlled manner, while the setName(String newCname) method allows external classes to change the value of Cname variable.

By keeping the instance variable Cname private, the class ensures that the value of Cname can only be accessed and modified through the provided methods, and not directly. This protects the internal state of the object and ensures that it can't be changed in an unexpected or invalid way.

It can be used like this:

```

Encapsulation_Customer obj = new Encapsulation_Customer();
obj.setName("John");
System.out.println(obj.getName());

```
This will output:

`John`

---

### Modifier_Default
**Code:**

```Java
package bank;

class Bank_Acct{
	public static void main(String[] args){
	System.out.println("Account Details");
	}

}


```

This program defines a class called "Bank_Acct" which is in a package called "bank".

The class contains a single method called main. The main method is the entry point for a Java program and is where the program starts executing. In this case, the method contains a single statement System.out.println("Account Details"), which prints the string "Account Details" to the console.

This program does not have any other functionality. It simply prints "Account Details" on the console when executed.

This program can be run by executing the command java bank.Bank_Acct in the command line.

It is important to note that if this class is intended to be used as a blueprint for creating bank account objects in a larger program, it should probably contain other methods and variables to represent the account details and functionality that a bank account would have.

### Modifier_Private.java
**Code:**

```java
class Bank_Acct{
	private String CName= "Dan Joe";
	private String Cemail= "dan.joe@gmail.com";
	private String Address= "PO Box 555 Mombasa";
	private int age= 32;
	private String phoneNumber = "+254733777214";
		
public static void main(String[] args){
	
	Bank_Acct obj = new Bank_Acct();
	System.out.println("Name: " + obj.CName);
	System.out.println("Email: " + obj.Cemail);
	System.out.println("Address: " + obj.Address);
	System.out.println("Age: " + obj.age);
	System.out.println("Mobile:"  + obj.phoneNumber);

     }
}

```
This program defines a class called "Bank_Acct" which contains several private class level variables (CName, Cemail, Address, age, phoneNumber) that store the name, email, address, age, and phone number of a customer respectively. These variables are initialized with default values at the time of declaration.

The class also contains a main method, which is the entry point for the program. Inside the main method, an object of the Bank_Acct class is created, and the values of the private variables are accessed and printed to the console using the dot notation.

This program will output the following:

```Java

Name: Dan Joe
Email: dan.joe@gmail.com
Address: PO Box 555 Mombasa
Age: 32
Mobile: +254733777214

```
It is important to note that the variables are private and can only be accessed within the class where they are defined, if you want to access these variables from other class you will have to create a public getter methods to access them.

### Modifiers.java
**Code:**

```Java
//Private class modifier

class Bank_Acct{
	private String CName= "Dan Joe";
	private String Cemail= "dan.joe@gmail.com";
	private String Address= "PO Box 555 Mombasa";
	private int age= 32;
	//private double phoneNumber = 254733777214;
		
public static void main(String[] args){
	
	Bank_Acct obj = new Bank_Acct();
	System.out.println("Name: " + obj.CName);

     }
}

```


This program is similar to the previous one, the difference is that it is missing the phoneNumber variable, and also the phoneNumber variable type is different from the previous program.

The class "Bank_Acct" contains private class level variables (CName, Cemail, Address, age) that store the name, email, address, and age of a customer respectively. These variables are initialized with default values at the time of declaration.

The class also contains a main method, which is the entry point for the program. Inside the main method, an object of the Bank_Acct class is created, and the value of the private variable CName is accessed and printed to the console using the dot notation.

This program will output the following:


`Name: Dan Joe`

It is important to note that the variables are private and can only be accessed within the class where they are defined, if you want to access these variables from other class you will have to create a public getter methods to access them.




---

### Bank.java
**Code:**

```java
package Bank;

public class _bank{

	public static void main(String[] args) {
		System.out.println("My Bank");

     }
}


```
This program defines a class called "_bank" which is in a package called "Bank".

The class contains a single method called main. The main method is the entry point for a Java program and is where the program starts executing. In this case, the method contains a single statement System.out.println("My Bank"), which prints the string "My Bank" to the console.

This program does not have any other functionality. It simply prints "My Bank" on the console when executed.

This program can be run by executing the command java Bank._bank in the command line.

It is important to note that if this class is intended to be used as a blueprint for creating bank objects in a larger program, it should probably contain other methods and variables to represent the bank details and functionality that a bank would have.



### packageTest.java
**Code:**

```Java
import bank.*;

class test{
	public static void main(String[] args){
	
	
	}

}

```
This Java code defines a class called "test" that contains a main method. The class also has an import statement which imports all classes from the package "bank". This means that any class in the "bank" package can be used in the "test" class without having to specify the package name. But the main method is empty and doesn't do anything.

---

### mapHash.java
**Code:**

```java
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities); 
  }
}

```
This code creates a HashMap object called "capitalCities" which stores key-value pairs. The keys are strings representing countries, and the values are strings representing their respective capital cities. The code then adds four key-value pairs to the HashMap using the put() method. It adds "England" as a key and "London" as its value, "Germany" as a key and "Berlin" as its value, "Norway" as a key and "Oslo" as its value, and "USA" as key and "Washington DC" as its value. Finally, the code prints the entire HashMap using the println() method. The output will be like this: {USA=Washington DC, Germany=Berlin, England=London, Norway=Oslo}

---

### methods.java
**Code:**

```Java
public class Main{
   static void method_one(){
   System.out.println("Learn English, German, Swahili and French");
   
   }
   
   public static void main(String[] args){
      method_one();
      method_one();
      method_one();
      method_one();
      method_one();
   
   }

}  

```
This program defines a static method called method_one() that simply prints out the string "Learn English, German, Swahili and French". In the main() method, the program then calls this method five times in a row. So when the program runs, it will output the string "Learn English, German, Swahili and French" five times.

### method1.java
**Code:**

```Java
public class Main{
   static void method1(String Fruit_name){
   System.out.println(Fruit_name + " Orange");
        
   }
   
   public static void  main(String[] args){
   
      method1("which fruit has a Color is yellow or green?" );
         
   }

}

```
This code defines a class called Main, which has a static method called method1. The method takes in a String parameter called Fruit_name. The method then prints out the value of the Fruit_name parameter followed by the string " Orange". In the main method, the method1 is called with the argument "which fruit has a Color is yellow or green?" and it will print out "which fruit has a Color is yellow or green? Orange" when run.

### method2.java
**Code:**

```Java
public class Main{
   static void compare(int num){
   if (num <= 32){
   System.out.println("Wrong Number");
   
   } else {
   System.out.println("Re-enter number ");
   
   }
   
  }
   
public static void main(String[] args){
   compare(22);
  }
}

```
This Java code defines a class called Main, which contains a static method called compare. The compare method takes an integer argument called num, and compares it to the value 32. If the value of num is less than or equal to 32, the method prints "Wrong Number". Otherwise, it prints "Re-enter number". The main method of the class then calls the compare method and passes in the value 22 as the argument. So when the program is executed, it will print "Wrong Number".

### method3.java
**Code:**

```Java
public class Main {
static int method3(int x, int y){
   return x / y ; 
   
}

static double method3_one(double x, double y){
    return x*y ;

}

public static void main(String[] args){
   int numA = method3(100, 20);
   double numB = method3_one(10.2, 2.20);
   System.out.println("Math func int =  " + numA);
   System.out.println("Math func double =  " + numB);
  }

}

```
This Java code defines a class called Main, which contains two static methods called method3 and method3_one. The method3 takes two integer arguments (x and y) and returns the result of x divided by y. The method3_one takes two double arguments (x and y) and returns the result of x multiplied by y.

The main method of the class creates two variables, numA and numB, and assigns them the values returned by calling the method3 and method3_one respectively, with the arguments (100, 20) and (10.2, 2.20) respectively.

Then, the main method prints out the values of the variables numA and numB, along with a string "Math func int =" and "Math func double =" respectively.

So when the program is executed, it will print "Math func int = 5" and "Math func double = 22.44"

### method4.java
**Code:**

```Java
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

```
This Java code defines a class called Main, which contains a main method and a method called sum.

The main method calls the sum method, passing the value 5 as an argument, and assigns the returned value to the variable "result". Then it prints out the value of "result"

The sum method takes an integer argument "i" and uses a recursive approach to calculate the sum of integers from 1 to i.
The method first checks if the passed argument is greater than 0, if it's true, it adds the current value of i to the value returned by calling the sum method again with an argument of i-1.
This process continues until the passed argument is no longer greater than 0, at that point, the method returns 0.

So when the program is executed, it will print "15", because 1 + 2 + 3 + 4 + 5 = 15

### method_overload.java
**Code:**
```Java
public class Main {
    static int plusMethodInt(int x, int y) {
      return x + y;
    }
    
    static double plusMethodDouble(double x, double y) {
      return x + y;
    }
    
public static void main(String[] args) {
      int myNum1 = plusMethodInt(8, 5);
      double myNum2 = plusMethodDouble(4.3, 6.26);
      System.out.println("int: " + myNum1);
      System.out.println("double: " + myNum2);
   }

}


```
This Java code defines a class called Main, which contains two static methods called plusMethodInt and plusMethodDouble.
The plusMethodInt method takes two integer arguments (x and y) and returns the sum of x and y.
The plusMethodDouble method takes two double arguments (x and y) and returns the sum of x and y.

In the main method, it creates two variables, myNum1 and myNum2, and assigns them the values returned by calling the plusMethodInt and plusMethodDouble respectively, with the arguments (8, 5) and (4.3, 6.26) respectively.
Then, the main method prints out the values of the variables myNum1 and myNum2, along with strings "int: " and "double: " respectively.

So when the program is executed, it will print "int: 13" and "double: 10.56"

### method_overload2.java
**Code:**

```Java
public class Main {
static int addMethod(int numA , int numB)
{
return numA + numB;

}
static double addDouble(double numA , double numB)
{
return numA + numB;

 }

public static void main(String[] args){
int num_intAdd_Answer = addMethod(4,5);
double num_doubleAdd_Answer = addDouble(3.12,6.12);
System.out.println("int answer:" + num_intAdd_Answer);
System.out.println("double answer: " + num_doubleAdd_Answer);

 }


}

```
This Java code defines a class called Main, which contains two static methods called addMethod and addDouble.
The addMethod method takes two integer arguments (numA and numB) and returns the sum of numA and numB.
The addDouble method takes two double arguments (numA and numB) and returns the sum of numA and numB.

In the main method, it creates two variables, num_intAdd_Answer and num_doubleAdd_Answer, and assigns them the values returned by calling the addMethod and addDouble respectively, with the arguments (4,5) and (3.12,6.12) respectively.
Then, the main method prints out the values of the variables num_intAdd_Answer and num_doubleAdd_Answer, along with strings "int answer:" and "double answer: " respectively.

So when the program is executed, it will print "int answer: 9" and "double answer: 9.24"

---


