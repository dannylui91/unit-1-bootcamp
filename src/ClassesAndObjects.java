/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

  public static void main (String args[]) {
    // 1. Create 3 cats named `Garfield`, `Pink Panther`, and `Catwoman`.
    Cat garfield = new Cat("Garfield");
    Cat pinkPanther = new Cat("Pink Panther");
    Cat catWoman = new Cat("Catwoman");

    // 2. Assign each of them a favorite food (Garfield's favorite food should be `Lasagna`).
    garfield.setFavoriteFood("Lasagna");
    pinkPanther.setFavoriteFood("Chicken");
    catWoman.setFavoriteFood("Tuna");

    // 3. Assign each of them an age.
    garfield.setAge(20);
    pinkPanther.setAge(14);
    catWoman.setAge(15);

    System.out.println(isOlder(garfield, pinkPanther));
  }

  // 2. isOlder
  public static boolean isOlder(Cat cat1, Cat cat2) {
    return cat1.getAge() > cat2.getAge();
  }

  // 3. Best Friends
  public static void makeBestFriends(Cat cat1, Cat cat2) {
    cat1.setFavoriteFood(cat2.getFavoriteFood());
  }

  // 4. Kitten
  public static Cat makeKitten(Cat cat1, Cat cat2) {
    Cat cat = new Cat(cat1.getName() + cat2.getName());
    cat.setAge(0);
    return cat;
  }

  // 5. Adoption
  public static void adoption(Cat cat, Person person) {
    if (cat.getName() == "Catwoman") {
      System.out.println("Catwoman will never be anyone's pet!");
    } else {
      cat.setOwner(person);
    }
  }

  // 6. isFree
  public static boolean isFree(Cat cat) {
    return cat.getOwner() == null;
  }

  // 7. isSibling
  public static boolean isSibling(Cat cat1, Cat cat2) {
    return cat1.getOwner().equals(cat2.getOwner());
  }
}
