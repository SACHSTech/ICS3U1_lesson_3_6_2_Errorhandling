import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
      int speed;
    
      try{
         System.out.print("Enter the distance travelled:  ");
         int distance = scan.nextInt();

         System.out.print("Enter the hours elapsed:  ");
         int hours = scan.nextInt();

      
          speed = distance/hours;
          System.out.println("The speed is " + speed);
        }
        
      catch (ArithmeticException error){
          System.out.println("Error occurred: " + error.getMessage());
          System.out.println("Enter hours elapsed > 0");
       }
        
      catch (InputMismatchException error){
        //System.out.println("Error occurred: " + error.getMessage());
        System.out.println("Error when inputting data, you must enter integers only.");
       
      }
    

  }
}