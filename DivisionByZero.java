class DivisionByZero extends ConsoleProgram {

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

    intSpeed = intDistance/intHours;


    System.out.println("The speed is " + intSpeed);
  }  
}

