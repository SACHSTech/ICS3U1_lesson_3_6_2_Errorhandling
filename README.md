

# **3.6.2 Run-Time Errors and Exceptions**

Run-time errors are errors that occur while your program runs. Syntactically the program may be correct, however, these typically occur when your program attempts an operation that is impossible to carry out. These impossible operations or failed operations are called **exceptions**.

An example of this is division by zero. Suppose you had the following program:


```
class DivisionByZero extends ConsoleProgram {

  /**
  * A speed calculation program that demonstrates an Arithmetic exception
  * @author:E. Fabroa
  */
  
  public void run() {
    double dblDistance;
    double dblSpeed;
    double dblHours;

    dblDistance = readDouble("Enter the distance travelled: ");
    dblHours = readDouble("Enter the hours elapsed: ");

    dblSpeed = dblDistance/dblHours;

    System.out.println("The speed is " + dblSpeed);
  }  
}


```

If the variable hours has a value of 0, the division operation fails and causes a run-time error or exception. Specifically, this is an `ArithmeticException` that occurs when something goes wrong during an arithmetic operation.   The program must run in order for this error to be detected, and if hours contains a valid value, it will not occur at all.

Some other examples:

* incorrect data type entered (i.e double inputted when int expected) - 
* square root of a negative number - `ArithmeticException`
* referring to an invalid index of a String when doing substring - `IndexOutOfBoundsException`




## **Dealing with Run-Time Errors**


### **Exception Handling**

One option for handling run-time errors is to detect cases where run-time errors would occur and build in conditions to handle those cases.  


#### **Exception Handling General Form**


```
try{
    … code to execute
}	
catch (type-of-exception error_object){
    … code the handle exception
}


```


The set of statements in the curly braces following the try keyword is called the try clause.  The set of statements in the curly braces following the catch keyword is called the catch clause.

When we ran the above program with hours 0 and had the `ArithmeticException` error appear because.  We can include this error in our catch statement.


```
class DivisionByZero2 extends ConsoleProgram {

  /**
  * A speed calculation program that demonstrates an Arithmetic exception
  * @author:E. Fabroa
  */
  
  public void run() {
    double dblDistance;
    double dblSpeed;
    double dblHours;

    dblDistance = readDouble("Enter the distance travelled: ");
    dblHours = readDouble("Enter the hours elapsed: ");  // enter 0 for this

    // apply exception handling to this
    try {
      
    } catch (ArithmeticException err) {
        System.out.println("Hours must be greater than 0.");
    }
    dblSpeed = dblDistance/dblHours;

    System.out.println("The speed is " + dblSpeed);
  }  
}
```

We can also utilize the 'err' error variable to get details on the error.

try{
   speed = distance/hours;
   System.out.println("The speed is " + speed);

}catch (ArithmeticException err){
   System.out.println("The monkeys have detected an issue: " + err.getMessage());
}
```

## Example: IndexOutofBoundsException







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
