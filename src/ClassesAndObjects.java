/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

  public static void main (String args[]) {

      Cat a = new Cat();
      Cat b = new Cat();
      Cat c = new Cat();

      a.setName("Garfield");
      b.setName("Pink Panther");
      c.setName("Catwoman");

      a.setFavoriteFood("Lasagna");
      b.setFavoriteFood("Candy");
      c.setFavoriteFood("Fish");

      a.setAge(5);
      b.setAge(3);
      c.setAge(8);

      Cat kitten = Cat.makeKitten(a,c);

      System.out.println(kitten.getName()+" "+kitten.getAge());
  }

  }
