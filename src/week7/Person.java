package week7;
/*
 * created by Harsh Patel
 */
public class Person {

    String firstName;//instance variable
    String lastName;//instance variable
    int age;

    //main method
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFirstName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());


    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String setFirstName(String fName) {
        firstName = fName;
        return fName;
    }

    public String setLastName(String lName) {
        lastName = lName;
        return lName;
    }

    public int setAge(int age1) {
        if (age1 >= 0 && age <= 100) {
            return age = age1;
        } else
            return age;
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        } else
            return false;
    }

    public String getFullName() {
        if (firstName.isEmpty()) {
            return firstName;
        } else if (lastName.isEmpty()) {
            return lastName;
        }

        String fullName = (firstName + " " + lastName);
        return fullName;
    }
}



