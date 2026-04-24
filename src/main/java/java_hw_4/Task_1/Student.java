package java_hw_4.Task_1;

public class Student {

    private String forename;
    private String lastname;
    private int age;

    public Student(String forename, String lastname, int age) {
        this.forename = forename;
        this.lastname = lastname;
        this.age = age;
    }
    public String getForename() {
        return forename;
    }
public String getLastname() {
        return lastname;
}
    public String getFullname() {
        return this.forename + " " + lastname;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    @Override
    public String toString() {
        return "Student{" +
                "forename='" + forename + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}


