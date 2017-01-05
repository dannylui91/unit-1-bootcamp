import java.util.Random;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {

  public static void main (String args[]) {
    System.out.println(calculateSquare(7));
    System.out.println(calculateSquareRoot(9));
    System.out.println(toLowerCase("Hello World"));
    System.out.println(isMultiple(6, 48));
    prettyInteger(10);
    System.out.println(random(5, 10));
  }

  // 1. Calculate Square
  public static int calculateSquare(int i) {
    return i * i;
  }

  // 2. Calculate Square Root
  public static double calculateSquareRoot(int i) {
    return Math.sqrt(((double) i));
  }

  // 3. toLowerCase
  public static String toLowerCase(String input) {
    return input.toLowerCase();
  }

  // 4. isMultiple
  public static boolean isMultiple(int i, int j) {
    return (j % i == 0);
  }

  // 5. Pretty Integer
  public static void prettyInteger(int i) {
    String s = "";
    for (int j = 0; j < i; j++) {
      s += "*";
    }
    System.out.println(s + " " + i + " " + s);
  }

  // 6. Random
  public static int random(int min, int max) {
    Random r = new Random();
    return r.nextInt(max - min) + min;
  }
}
