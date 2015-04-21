/**
 * Cool cats
 * <p/>
 */
public class Cat {

    private String name;
    private String favoriteFood;
    private int age;
    private Person owner;

    public Cat() {

    }

    public static boolean isSibling(Cat b, Cat c) {
        if (b.getOwner().equals(c.getOwner())) {
            return true;
        } else
            return false;
    }

    public static boolean isFree(Cat c) {
        if (c.getOwner().equals(null)) {
            return true;
        } else
            return false;
    }

    public static void adopiton(Cat c, Person j) {
        c.setOwner(j);
    }

    public static Cat makeKitten(Cat a, Cat c) {
        Cat newCat = new Cat();
        //  int newCatAge = 0;
        //  String newCatName =  a.getName()+ "." +c.getName();

        newCat.setAge(0);
        newCat.setName(a.getName() + "." + c.getName());

        return newCat;

    }

    public static void makeBestFriends(Cat b, Cat c) {

        String FavoriteFb = b.getFavoriteFood();
        c.setFavoriteFood(FavoriteFb);

    }

    public static boolean isOlder(Cat a, Cat b) {

        int ageOfA = a.getAge();
        int ageOfB = b.getAge();

        boolean result = ageOfA > ageOfB;
        return result;

    }

    public Cat(String name) {

        this.name = name;
    }

    public String getFavoriteFood() {


        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }
}
