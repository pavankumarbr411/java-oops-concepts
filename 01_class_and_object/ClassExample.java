public class Student {
    String name;
    int age;

    void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Pavan";
        s1.age = 21;
        s1.displayInformation();
    }
}
