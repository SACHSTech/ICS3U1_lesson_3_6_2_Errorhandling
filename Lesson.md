

# **3.6.2 Run-Time Errors and Exceptions**

Run-time errors are errors that occur while your program runs. Syntactically the program may be correct, however, these typically occur when your program attempts an operation that is impossible to carry out.

An example of this is division by zero. Suppose you had the following program:


```
  public void run() {
    double dblDistance;
    double dblSpeed;
    double dblHours;

    dblDistance = readDouble("Enter the distance travelled: ");
    dblHours = readDouble("Enter the hours elapsed: ");

    dblSpeed = dblDistance/dblHours;

    System.out.println("The speed is " + dblSpeed);
  }  
```


If the variable hours has a value of 0, the division operation fails and causes a run-time error. The program must run in order for this error to be detected, and if hours contains a valid value, it will not occur at all.

Some other examples:



* incorrect data type entered (i.e double inputted when int expected)
* square root of a negative number
* referring to an invalid index of a String when doing substring




#### **Dealing with Run-Time Errors**


##### **Exception Handling**

One option for handling run-time errors is to detect cases where run-time errors would occur and build in conditions to handle those cases.  


##### **Exception Handling General Form**


```
try{
    … code to execute
}	
catch (type-of-exception id){
    … code the handle exception
}


```


The set of statements in the curly braces following the try keyword is called the try clause.  The set of statements in the curly braces following the catch keyword is called the catch clause.

When we ran the above program with hours 0 and had the `ArithmeticException` error appear because.  We can include this error in our catch statement.


```
import java.util.Scanner;

public class Speed {
   public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int speed;

       System.out.print("Enter the distance travelled:  ");
       int distance = scan.nextInt();

       System.out.print("Enter the hours elapsed:  ");
       int hours = scan.nextInt();

       try{
           speed = distance/hours;
           System.out.println("The speed is " + speed);

       }catch (ArithmeticException e){
           System.out.println("Invalid input. Hours must be greater than 0");
       }
   }
}

We can also utilize the 'e' error variable to get details on the error.

try{
   speed = distance/hours;
   System.out.println("The speed is " + speed);

}catch (ArithmeticException e){
   System.out.println("The monkeys have detected an issue: " + e.getMessage());
}
```


We can modify the try-catch to include the user input portions of the code to prevent non-int input from crashing the program.


```
import java.util.InputMismatchException;
import java.util.Scanner;

public class Speed {
   public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int speed;

       try{
           System.out.print("Enter the distance travelled:  ");
           int distance = scan.nextInt();

           System.out.print("Enter the hours elapsed:  ");
           int hours = scan.nextInt();

           speed = distance/hours;
           System.out.println("The speed is " + speed);

       }catch (ArithmeticException err){
           System.out.println("The monkeys have detected an issue: " + err.getMessage());
       }catch (InputMismatchException err){
           System.out.println("Error when inputting data, you must enter integers only.");

       }
   }
}
```



## Example: ConsoleProgram readDouble()

A good example of usage of try-catch exception handling is in the CodeHS implementation of readDouble().


```
public double readDouble(String prompt){

  while(true){
     String input = readLine(prompt);
     try {
        double n = Double.valueOf(input).doubleValue();
        return n;
     } catch (NumberFormatException e){

     }
  }
}
```



### More Examples

You can see the list of [built-in exceptions examples here](http://www.geeksforgeeks.org/types-of-exception-in-java-with-examples/)


## Methods, Preconditions and throwing exceptions


### **Preconditions**

By convention, preconditions on public methods are enforced by explicit checks inside methods resulting in particular, specified exceptions. For example


```
         /**
     * Sets the refresh rate.
     *
     * @param  rate refresh rate, in frames per second.
     * @throws IllegalArgumentException if rate <= 0 or
     *          rate > 100.
     */
     public void setRefreshRate(int rate) {
         // Enforce specified precondition in public method
         if (rate <= 0 || rate > 100)
             throw new IllegalArgumentException("Illegal rate: " + rate);

         System.out.println("rate set.")
         }
