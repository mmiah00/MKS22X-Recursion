import java.util.ArrayList;

public class Recursion {
  public static double mysqrt (double n, double guess, double tolerance) {
    if (n == 0) {
      return 0;
    }
    if (percentDifference (guess, n) > tolerance) {
      return mysqrt (n,((n/guess + guess) / 2), tolerance);
    }
    else {
      return guess;
    }
  }

  public static double sqrt (double n, double tolerance) {
    return mysqrt (n, 1, tolerance);
  }

  public static double percentDifference (double guess, double square) {
    double mysquare = guess * guess;
    return ((Math.abs (mysquare - square)) / square) * 100;
  }

  public static int fib (int n) {
    return myfib (n,n);
  }

  public static int myfib (int count, int n) {
    if (count < 2) {
      return count;
    }
    else {
      if (count - 2 < n) {
        return myfib (count - 2,n) + myfib (count - 1, n);
      }
      else {
        return myfib (count, n);
      }
    }
  }

  public static ArrayList<Integer> makeAllSums(int n){
    return mas (0, n);
  }

  public static ArrayList <Integer> mas (int start, int n) {
    ArrayList <Integer> sums = new ArrayList <Integer> ();
    return sums;
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
  }
}
