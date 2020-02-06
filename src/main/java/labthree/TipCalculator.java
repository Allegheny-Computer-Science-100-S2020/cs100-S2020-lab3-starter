package labthree;

// TODO: Add the correct imports at the top of the program

import java.util.Date;
import java.util.Scanner;

/** This class has a method that calculates a tip based on file input.
 * The first line displays the name of the programmer and the date. Then, the
 * program's main method reads in some values from a file and performs a
 * calculation for a suitable tip. Finally, the program displays diagnostic
 * output and then the output resulting from the computation.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Add Your Name Here
 */

public class TipCalculator {

  /** The main entry point for TipCalculator.
   *  The source code inside of this method will be executed when the program is
   *  run in the command-line. The program uses the Scanner to read values from
   *  the file, perform a computation, and then display values to the user.
   *
   * @param args The command-line arguments
   *
   **/
  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Gregory M. Kapfhammer " + new Date());
    // declare the starting file and scanner
    File tipInputsFile = null;
    Scanner scanner = null;
    // TODO: Note that this code will not compile correcly
    // unless you add the required imports at the start of the program!
    // connect the scanner to the input file
    try {
      tipInputsFile = new File("input/tip_inputs.txt");
      scanner = new Scanner(tipInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: read in and display the person's name
    String name = scanner.nextLine();
    System.out.println(name + ", welcome to the tip calculator.");
    // TODO Step Two: read in and display the amount of the bill

    // TODO Step Three: Read in and display the tip percentage

    // TODO Step Four: Calculate and display the tip amount

    // TODO Step Five: Calculate and display the total bill

    // TODO Step Six: Read in and display the number of bill payers

    // TODO Step Seven: Calculate and display the amount each person should pay

    // TODO Step Eight: Display a final thankyou message

    // TODO: Make sure that you only use nine println statements for ten lines of output!
  }

}
