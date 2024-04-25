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
    dblHours = readDouble("Enter the hours elapsed: ");  // enter 0 for this

    dblSpeed = dblDistance/dblHours;

    System.out.println("The speed is " + dblSpeed);
  }  
}

