import java.util.Scanner;

/**
 * This proogram creates a multiplication table through 1-12
 * @author Austin Kavelman
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    //initialize variable for the numbers
    int n, i;
    //asks the user to enter an interger to multiply
    System.out.println("Please enter an integer to create a multiplication table for");
    //interger for number entered
    n = input.nextInt();

    //for loop for multiplication table (1-12)
    for(i = 1; i <= 12; i++){
      System.out.println(n + "x" + i + " = " + (n*i));    }



  }
}
