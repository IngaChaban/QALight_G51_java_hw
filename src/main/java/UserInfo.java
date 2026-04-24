

public class UserInfo {
    String firstname;
    String lastname;
    int age;
    String country;

    public UserInfo(String firstname, String lastname, int age, String country) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.country = country;
    }


    public static void main(String[] args) {

        UserInfo user = new UserInfo("Brian", "Moor", 38, "Ireland");
        System.out.println();
        System.out.println("User name: " + user.firstname);
        System.out.println("User last name: " + user.lastname);
        System.out.println("Age: " + user.age);
        System.out.println("Country: " + user.country);
        System.out.println("Welcome Brian!");
    }

}