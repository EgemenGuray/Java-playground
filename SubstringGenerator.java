/* Alara Degirmenci, partner with Buket Yenenler
 * Substring Generator
 * 21.11.2017
 * CW
 * */

import java.util.ArrayList;

public class SubstringGenerator
{
  //attributes
  String text; 
  ArrayList<String> substrings = new ArrayList<String>(); // arraylist to store the substrings 
  
  public SubstringGenerator()
  {
  }
  
  //method to generate the substrings
  public void generate(String word) 
  {
    text=word;
    if(text.length()==0) // base case 
    {
      return;
    }
    else
    {
      for(int i = text.length();i>=0;i--)
      {
        substrings.add(text.substring(0,i)); //generates the substrings and adds them to the arraylist 
      }
    }
    text=text.substring(1); // removes the first letter of the original string
    generate(text); // recursion
  }
  
  //method to return the arraylist
  public ArrayList getArrayList()
  {
    return substrings;
  }
}