//UID:24BCS10773

class Student {
    int uid;
    String name;
    String course;
    Student() {
        uid = 10773;
        name = "Disha";
       course = "CSE";
    }
    Student(int uid,String name,String course){
        this.uid=uid;
        this.name=name;
        this.course=course;
    }
    void display() {
        System.out.println("UID: " + uid);
        System.out.println("Name: " + name);
        System.out.println("Course: " +course);
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        Student s2 = new Student(1001, "Yashvi", "CSE");
        s2.display();
    }
}
