public class Recursion {
  public static double mysqrt (double n, double guess) {
    if (n == 0) {
      return 0;
    }
    if (percentDifference (guess, n) > .00001) {
      return mysqrt (n,((n/guess + guess) / 2));
    }
    else {
      return guess;
    }
  }

  public static double sqrt (double n) {
    return mysqrt (n, 1);
  }

  public static double percentDifference (double guess, double square) {
    double mysquare = guess * guess;
    return ((Math.abs (mysquare - square)) / square) * 100;
  }

  public static void main (String[] args) {
    System.out.println ("Number" + "\t" + "Real" + "\tMine");
    for (int x = 0; x < 21; x ++) {
      System.out.println ( (x * x) + "\t" + x + "\t" + (sqrt (x * x)));
    }
  }
}
