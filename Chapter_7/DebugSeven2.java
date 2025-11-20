// Program prompts user to enter a series of integers
// separated by spaces
// Program converts them to numbers and sums them
import java.util.*;

public class DebugSeven2
{
   public static void main(String[] args)
   {
      String str;
      int x;
      int length;
      int lastSpace = -1;
      int sum = 0;
      String partStr;
      Scanner in = new Scanner(System.in);

      System.out.print("Enter a series of integers separated by spaces >> ");
      str = in.nextLine();
      length = str.length();     // FIX

      for(x = 0; x < length; ++x)   // FIX
      {
         if(str.charAt(x) == ' ')
         {
            partStr = str.substring(lastSpace + 1, x);
            int num = Integer.parseInt(partStr);
            System.out.println(" " + num);
            sum += num;
            lastSpace = x;
         }
      }

      // Process the last number
      partStr = str.substring(lastSpace + 1, length);
      int num = Integer.parseInt(partStr);   // FIX
      System.out.println(" " + num);
      sum += num;                             // FIX (+= instead of =)

      System.out.println("-------------------" +
         "\nThe sum of the integers is " + sum);
   }
}
