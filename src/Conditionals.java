/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

  public static void main (String args[]) {
    System.out.println(isOdd(5));
    System.out.println(isMultipleOfThree(3));
    System.out.println(isOddAndIsMultipleOfThree(12));
    System.out.println(isOddAndIsMultipleOfThree2(15));
    fizzMultipleofThree(24);

    Person p = new Person("Harry");
    p.setCity("London");
    isFromLondon(p);
    checkNameSize(p);

    System.out.println(cigarParty(40, false));
    System.out.println(caughtSpeeding(61, true));
    System.out.println(alarmClock(0, true));
    System.out.println(lotteryTicket(10, 32, 32));
    System.out.println(blackjack(21, 4));
    System.out.println(evenlySpaced(2, 6, 3));
  }

  // 1. Write a method `isOdd` that takes in an `int` n. Returns a `true` if n is odd, and `false` otherwise.
  public static boolean isOdd(int n) {
    return (n % 2 != 0);
  }

  // > 2. Write a method `isMultipleOfThree` that takes in an `int` n. Returns `true` if n is a multiple of three, and `false` otherwise.
  public static boolean isMultipleOfThree(int n) {
    return n % 3 == 0;
  }

  // > 3. Write a method `isOddAndIsMultipleOfThree` that takes in an `int` n. Returns `true` if n is both odd and a multiple of three, and false otherwise.
  public static boolean isOddAndIsMultipleOfThree(int n) {
    return (n % 3 == 0) && (n % 2 != 0);
  }

  //> 4. Write a method `isOddAndIsMultipleOfThree2` - if you used `isOdd` and `isMultipleofThree` in your last solution, don't use it this time. If you did not, write this method building on your last methods.
  public static boolean isOddAndIsMultipleOfThree2(int n) {
    return (n % 3 == 0) && isOdd(n);
  }
  //> 5. Write a method `fizzMultipleofThree` that takes in an `int` n and prints "Fizz" if n is a multiple of three, and prints n otherwise.
  public static void fizzMultipleofThree(int n) {
    if (isMultipleOfThree(n)) {
      System.out.println("Fizz");
    } else
      System.out.println(n);
  }

  //> 5. Write a method that takes in a `Person` and returns `true` if the person is from London, and `false` otherwise.
  public static boolean isFromLondon(Person p) {
    return(p.getCity().equals("London"));
  }

  //> 6. Write a method that takes in a `Person` and prints the name if the person has a name longer than 5 characters, and otherwise prints "Name is too short."
  public static void checkNameSize(Person p) {
    if (p.getName().length() > 5) {
      System.out.println(p.getName());
    } else {
      System.out.println("Name is too short.");
    }
  }

  // 1. Cigar Party
  public static boolean cigarParty(int cigars, boolean isWeekend) {
    if (cigars >= 40 && cigars <= 60) {
      return true;
    } else if (isWeekend && cigars >= 60) {
      return true;
    } else {
      return false;
    }
  }

  // 2. Caught Speeding
  public static int caughtSpeeding(int n, boolean isBirthday) {
    int limit = 60;
    if (isBirthday) {
      limit += 5;
    }
    if (n <= limit) {
      return 0;
    } else if (n > limit && n <= limit + 20) {
      return 1;
    } else {
      return 2;
    }
  }

  // 3. Alarm Clock
  public static String alarmClock(int n, boolean onVacation) {
    if (onVacation) {
      if (n > 0 && n < 6) {
        return "10:00";
      } else
        return "off";
    } else
      if (n > 0 && n < 6) {
        return "7:00";
      } else {
        return "10:00";
      }
  }

  // 4. Lottery Ticket
  public static int lotteryTicket(int a, int b, int c) {
    if (a != b && b != c && a != c ) {
      return 0;
    } else if (a == b && b == c && a == c) {
      return 20;
    } else {
      return 10;
    }
  }

  // 5. Blackjack
  public static int blackjack(int i, int j) {
    if (i > 21 && j <= 21) {
      return j;
    } else if (i <= 21 && j > 21) {
      return i;
    } else if (i > 21 && j > 21) {
      return 0;
    } else if (i > j) {
      return i;
    } else {
      return j;
    }
  }

  // 6. Evenly Spaced
  public static boolean evenlySpaced(int a, int b, int c) {
    int array[] = new int[3];
    array[0] = a;
    array[1] = b;
    array[2] = c;

    int min = array[0];
    int max = array[0];
    int med = array[0];
    for (int i = 0; i < 3; i++) {
      if (min > array[i]) {
        min = array[i];
      }
      if (max < array[i]) {
        max = array[i];
      }
    }
    for (int i = 0; i < 3; i++) {
      if (array[i] != min && array[i] != max)
        med = array[i];
    }
    return (med - min == max - med);
  }
}
