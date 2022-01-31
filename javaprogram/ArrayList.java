package javaprogram;

import java.util.Arrays;

/*public class ArrayList {
	public static void main(String args[]) {
	      // Call method with variable args  
		   printMax(34, 3, 3, 2, 56.5);
	      printMax(new double[]{1, 2, 3});
	   }

	   public static void printMax( double... numbers) {
	      if (numbers.length == 0) {
	         System.out.println("No argument passed");
	         return;
	      }

	      double result = numbers[0];

	      for (int i = 1; i <  numbers.length; i++)
	      if (numbers[i] >  result)
	      result = numbers[i];
	      System.out.println("The max value is " + result);
	   }
	}
*/


	

public class ArrayList {
  
public static void main(String[] args)   
{   
//defining an array of integer type   
int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
//invoking sort() method of the Arrays class  
Arrays.sort(array); 
System.out.println("Elements of array sorted in ascending order: ");  
//prints array using the for loop  
for (int i = 0; i < array.length; i++)   
{       
System.out.println(array[i]);   
}   
}  
}  






/*public class This_Example {
	   // Instance variable num
	   int num = 10;
		
	   This_Example() {
	      System.out.println("This is an example program on keyword this");	
	   }

	   This_Example(int num) {
	      // Invoking the default constructor
	      this();
	      
	      // Assigning the local variable num to the instance variable num
	      this.num = num;	   
	   }
	   
	   public void greet() {
	      System.out.println("Hi Welcome to Tutorialspoint");
	   }
	      
	   public void print() {
	      // Local variable num
	      int num = 20;
	      
	      // Printing the local variable
	      System.out.println("value of local variable num is : "+num);
	      
	      // Printing the instance variable
	      System.out.println("value of instance variable num is : "+this.num);
	      
	      // Invoking the greet method of a class
	      this.greet();     
	   }
	   
	   public static void main(String[] args) {
	      // Instantiating the class
	      This_Example obj1 = new This_Example();
	      
	      // Invoking the print method
	      obj1.print();
		  
	      // Passing a new value to the num variable through parametrized constructor
	      This_Example obj2 = new This_Example(30);
	      
	      // Invoking the print method again
	      obj2.print(); 
	   }
	}*/