import java.util.Scanner;
import java.util.InputMismatchException;

public class Speed {
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int speed;
      try {
        System.out.print("Enter the distance travelled:  ");
        int distance = scan.nextInt();

        System.out.print("Enter the hours elapsed:  ");
        int hours = scan.nextInt();
      
        speed = distance/hours;
        System.out.println("The speed is " + speed);

      }catch (ArithmeticException error){
        System.out.println("An issues has been detected: " + error.getMessage());

      }catch (InputMismatchException error){
        System.out.println("Error when inputting data, you must enter integers only.");
      }
   }
}