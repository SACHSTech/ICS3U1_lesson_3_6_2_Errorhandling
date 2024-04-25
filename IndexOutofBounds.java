class IndexOutOfBounds extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    String strUsername = readLine("Enter a username: ");
    System.out.println(strUsername.substring(4,8));

  }
}

