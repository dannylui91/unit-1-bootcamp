/**
 * Created by alexandraqin on 4/14/15.
 */
public class Variables {

  public static void main (String args[]) {
    // 1. [Programming by Doing - Using Variables](https://programmingbydoing.com/a/using-variables.html)
    int i = 113;
    double d = 2.71828;
    String s = "Computer Science";

    System.out.println( "This is room # " + i );
    System.out.println( "e is close to " + d );
    System.out.println( "I am learning a bit about " + s );

    System.out.println(isOdd(2));
    printHelloWorld();
    System.out.println(greatestCommonFactor(3,8));
  }

  // 2. Consider a method `isOdd`. What type should it return? What type(s) should it take in? Create the method signature.
  public static boolean isOdd(int num) {
    return (num % 2 != 0);
  }

  // 3. Consider a method `printHelloWorld`. What type should it return? What type(s) should it take in? Create the method signature.
  public static void printHelloWorld() {
    System.out.println( "Hello World" );
  }

  // 4. Consider a method `greatestCommonFactor`. What type should it return? What type(s) should it take in? Create the method signature.
  public static int greatestCommonFactor(int a, int b) {
    if (a == 0)
      return b;

    while (b != 0) {
      if (a > b)
        a = a - b;
      else
        b = b - a;
    }

    return a;
  }
}
