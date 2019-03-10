import java.util.ArrayList;

public class recursion {

  public static double sqrt (double n, double tolerance) {
    return mysqrt (n, 1, tolerance);
  }

  private static double mysqrt (double n, double guess, double tolerance) { //helper for sqrt
    if (n == 0) {
      return 0;
    }
    if (percentDifference (guess, n) > tolerance) { //if the percent difference between the two is not within the tolerance,
      return mysqrt (n,((n/guess + guess) / 2), tolerance); //you use Newtons formula to find the new guess.
    }
    else {
      return guess; //if it is within the tolerance, then you return the guess
    }
  }

  private static double percentDifference (double guess, double square) { //helper for mysqrt
    double mysquare = guess * guess;
    return ((Math.abs (mysquare - square)) / square) * 100;
  }

  public static int fib (int n) {
    return myfib (n,n); //count starts with n and counts down
  }

  private static int myfib (int count, int n) { //helper for fib
    if (count < 2) {
      return count;  //if 0 or 1, return 0/1
    }
    else {
      if (count - 2 < n) {
        return myfib (count - 2,n) + myfib (count - 1, n); //if two numbers before counter is less than n, add the fib of the one before and the one before that
      }
      else {
        return myfib (count, n); // if it's equal to n, then just return fib of count
      }
    }
  }

  public static ArrayList<Integer> makeAllSums(int n){
    ArrayList <Integer> ans = new ArrayList <Integer> ();
    return mas (n, 0, ans);
  }

  private static ArrayList <Integer> mas (int n, int part, ArrayList <Integer> sums) { //helper for makeAllSums, part is the partial sum
    if (n == 0) {
      sums.add (part); //add partial sum to the list if n is 0
      return sums;
    }
    else {
      if (n > 0) { //if positive,
        return mas (n - 1, part + n, mas (n - 1, part, sums)); // find mas of n - 1 and add n to part to create a new partial sum
      }
      else { //if negative,
        return mas (n + 1, part + n, mas (n + 1, part, sums)); //its similar to positive but you add 1 to n instead of subtract
      }
    }
  }

  /*
  public static String toString (ArrayList<Integer> list) { //to test
    String ans = "[";
    for (int x = 0; x < list.size (); x ++) {
      if (x != list.size () - 1) {
        ans += list.get (x) + ",";
      }
      else {
        ans += list.get (x);
      }
    }
    ans += "]";
    return ans;
  }

  public static void main (String[] args) {
    System.out.println ("Square Root:\nNumber" + "\t" + "Real" + "\tMine");
    for (int x = 0; x < 26; x ++) {
      System.out.println ( (x * x) + "\t" + x + "\t" + (sqrt ((x * x), .0001)));
    }

    System.out.println ("\nFibonacci:\nNumber\tSequence");
    for (int x = 0; x < 26; x ++) {
      System.out.println (x + "\t" + fib (x));
    }

    System.out.println ("\nMakeAllSums:\nNumber\tNumber of Sums");
    for (int x = 0; x < 10; x ++) {
      System.out.println (x + "\t" + makeAllSums (x).size ());
    }
  }
  */
}
