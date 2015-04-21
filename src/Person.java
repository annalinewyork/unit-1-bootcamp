import java.util.Scanner;

/*
Write a method that takes in a Person and returns true if the person is from London, and false otherwise.
Write a method that takes in a Person and prints the name if the person has a name longer than 5 characters,
and otherwise prints "Name is too short."
*/
public class Person {
  private String name;
  private String phoneNumber;
  private String city;

    public static void main (String [] args){
        System.out.println("give a city name.");
        Scanner input = new Scanner(System.in);
        String cityInput = input.nextLine();
        isLondon(cityInput);

        nameLength();
    }

  public Person() {
  }

  public Person(String name) {
    this.name = name;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


    public static void isLondon (String city){
        city.toLowerCase().equals("London");
        if (city.equals("london")){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    public static void nameLength (){
        System.out.println("give a person name.");
        Scanner input = new Scanner(System.in);
        String inputname = input.nextLine();

        if ((inputname.length()-1)<5){
            System.out.println("Name is too short.");
        }else {
            System.out.println(inputname);
        }
    }

}