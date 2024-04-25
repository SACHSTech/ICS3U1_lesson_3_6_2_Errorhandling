class DivisionByZero2 extends ConsoleProgram {
  /**
  * A speed calculation program that demonstrates an Arithmetic exception
  * @author:E. Fabroa
  */
  
  public void run() {
    int intDistance;
    int intSpeed;
    int intHours;

    intDistance = readInt("Enter the distance travelled: ");
    intHours = readInt("Enter the hours elapsed: ");  // enter 0 for this

    try{
      intSpeed = intDistance/intHours;
      System.out.println("The speed is " + intSpeed);
    }
    catch(ArithmeticException error){
      System.out.println("Error: " + error.getMessage() +  ". Illegal value for hours, enter a value greater then 0.");
    }
  }  

}

