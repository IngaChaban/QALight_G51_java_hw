package java_hw_4.Task_1;

public class Main {
    public static void main(String[] args) {
        Student studentBrian = new Student("Brian", "Moore", 20);
        Student studentMaria = new Student("Maria", "Ryan", 19);
        Student studentZlata = new Student("Zlata", "Kerr", 18);
        Student studentFiona = new Student("Fiona", "Mohan", 25);
        Student studentKaren = new Student("Karen", "Moran", 22);

        Student[] G8 =  {studentFiona, studentBrian, studentMaria, studentKaren, studentZlata};

        studentMaria.setForename("Tom");

        for (Student stu : G8) {
            System.out.println(stu.getFullname());
        }
    }
}





