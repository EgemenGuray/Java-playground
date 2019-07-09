/* Alara Degirmenci, partner with Buket Yenenler
 * Substring Generator Tester
 * 21.11.2017
 * CW
 * */

import java.util.Scanner;

public class SubstringGeneratorTester
{
  public static void main (String []args)
  {
    SubstringGenerator main = new SubstringGenerator();
    Scanner in = new Scanner(System.in);
    System.out.println("Which word's substrings would you like to generate?");
    String word = in.nextLine();
    main.generate(word); // generates the substrings of the inputted word
    System.out.println(main.getArrayList().toString()); // returns the arraylist containing substrings and prints them
    
  }
}