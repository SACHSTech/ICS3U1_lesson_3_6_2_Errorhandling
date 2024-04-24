class Program1 extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    int number_of_work_hours = 20;
    double hourly_rate = 10.90;
   
    double wages = hourly_rate * number_of_work_hours;
     
    double over_40_wages = (hourly_rate * 40) + ((number_of_work_hours-40) * hourly_rate * 1.5;

    if (number_of_work_hours <= 50){
        System.out.println("You've earned "+ wages + "dollars");
    }else{
        System.out.println("You've earned "+ over_40_wages + "dollars");
    }
  }  
}

