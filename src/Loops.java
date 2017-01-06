/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {

  public static void main (String args[]) {
    printOneThroughTen();
    printOneThroughTen2();
    printOneThroughN(10);
    printEvensTwoThroughN(10);
    sumOfOneThroughTen();
    sumOfOneThroughN(10);
    sumOfOneThroughTenThousand();
    printStringNTimes(10, "Hi");
    printStringConcatNTimes(10, "Hi");
    printFirstTenFib();
    printSumOfFirstTenFib();
    firstTenFib(10);
  }

  // 1. Write a method that prints the numbers 1 through 10 using a loop.
  public static void printOneThroughTen() {
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }
  }

  // 2. Write a method that prints the numbers 1 through 10 using a different kind of loop.
  public static void printOneThroughTen2() {
    int i = 1;
    while (i <= 10) {
      System.out.println(i);
      i++;
    }
  }

  // 3. Write a method that takes in an `int` n and prints the numbers 1 through n.
  public static void printOneThroughN(int n) {
    for (int i = 1; i <= n; i++) {
      System.out.println(i);
    }
  }

  // 4. Write a method that takes in an `int` n and prints the even numbers 2 through n.
  public static void printEvensTwoThroughN(int n) {
    for (int i = 2; i <= n; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
  }

  // 5. Write a method that prints the sum of 1 through 10 using a loop.
  public static void sumOfOneThroughTen() {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += i;
    }
    System.out.println(sum);
  }

  // 6. Write a method that takes in an `int` n and prints the sum of the numbers 1 through n using a loop.
  public static void sumOfOneThroughN(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    System.out.println(sum);
  }

  // 7. Use the method you wrote in part 6 to print the sum of the numbers from 1 through 10000.
  public static void sumOfOneThroughTenThousand() {
    sumOfOneThroughN(10000);
  }

  // 8. Write a method that takes in an `int` n and a `String` s and prints out s on its own line, n times. If n is negative, print "".
  public static void printStringNTimes(int n, String s) {
    if (n > 0) {
      for (int i = 0; i < n; i++) {
        System.out.println(s);
      }
    } else {
      System.out.println("");
    }
  }

  // 9. Modify the method to print out the string concatenated with itself n times.
  public static void printStringConcatNTimes(int n, String s) {
    if (n > 0) {
      for (int i = 0; i < n; i++) {
        System.out.print(s);
      }
    } else {
      System.out.println("");
    }
  }

  // 10. Write a method that prints the first ten Fibonnaci numbers.
  public static void printFirstTenFib() {
    int i = 0;
    int j = 1;
    for (int k = 0; k < 10; k++) {
      if (k < 2) {
        System.out.println(k);
      } else {
        int temp = i + j;
        System.out.println(temp);
        i = j;
        j = temp;
      }

    }
  }
  // 11. Modify the method to sum the first ten Fibonnaci numbers.
  public static void printSumOfFirstTenFib() {
    int i = 0;
    int j = 1;
    int sum = 0;
    for (int k = 0; k < 10; k++) {
      if (k < 2) {
        sum += k;
      } else {
        int temp = i + j;
        sum += temp;
        i = j;
        j = temp;
      }
    }
    System.out.println(sum);
  }

  // 12. Modify the method to take in an `int` n and sum the first n Fibonnaci numbers.
  public static void firstTenFib(int n) {
    int i = 0;
    int j = 1;
    for (int k = 0; k < n; k++) {
      if (k < 2)
        System.out.println(k);
      else {
        int temp = i + j;
        System.out.println(temp);
        i = j;
        j = temp;
      }
    }
  }

  // 1. sumNumbers
  public static int sumNumbers(String s) {
    String temp = "";
    int sum = 0;
    for (int i = 0; i < s.length(); i++) {
      if (Character.isDigit(s.charAt(i))) {
        while (i != s.length() && Character.isDigit(s.charAt(i))) {
          temp += s.charAt(i);
          i++;
        }
        sum += Integer.parseInt(temp);
        temp = "";
      }
    }
    return sum;
  }
}
