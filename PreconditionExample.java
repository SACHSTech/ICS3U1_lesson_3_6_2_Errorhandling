class PreconditionExample extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    // set the refresh rate
    setRefreshRate(0);
  }

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

    System.out.println("rate set");
    }

}

