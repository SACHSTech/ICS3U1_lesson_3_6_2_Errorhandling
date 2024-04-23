import java.util.Scanner;

public class Speed1 {
   public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int speed;

       System.out.print("Enter the distance travelled:  ");
       int distance = scan.nextInt();

       System.out.print("Enter the hours elapsed:  ");
       int hours = scan.nextInt();

       speed = distance/hours;

       System.out.println("The speed is " + speed);
   }
}