class Program2 extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    String firstName = "";
    String lastName = "";

    firstName =readLine("Enter your first name: ");
    firstName = readLine("Enter your last name: ");

    System.out.println("Hello " + firstName + " " + lastName);
  }
}

