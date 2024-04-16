import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
        ArrayList<Integer> data = new ArrayList<Integer>();
    ArrayList<Integer> counter = new ArrayList<Integer>();
    int inputs = in.nextInt();

    for(int i = inputs; i > 0; i--)
    {
      int number = in.nextInt();
      boolean b = data.contains(number);
      if (!b) {
        data.add(number);
        counter.add(1);
      } else {
        int index = data.indexOf(number);
        counter.set(index, counter.get(index) + 1);
      }
    }
    int highest = 0;
    int highestd = 0;
    for(int i = 0; i < data.size(); i++)
    {
      if (counter.get(i) > highest) {
        highest = counter.get(i);
        highestd = data.get(i);
      }
    }
    System.out.println(highestd);
  }
}
