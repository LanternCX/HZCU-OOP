package cn.edu.hzcu.cs.oop.caoxin;
import java.util.ArrayList;

class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public String[] getStudents() {
        return students.toArray(new String[0]);
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        students.remove(student);
    }
}

public class Lab18T1 {
    public static void main(String[] args) {
        Course course1 = new Course("course1");
        course1.addStudent("Peter Jones");
        course1.addStudent("Brian Smith");
        course1.addStudent("Anne Kennedy");

        Course course2 = new Course("course2");
        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        for (String s : course1.getStudents()) {
            System.out.print(s + "  ");
        }

        System.out.println("\n");
        System.out.println("Number of students in course2: " + course2.getNumberOfStudents());
        for (String s : course2.getStudents()) {
            System.out.print(s + "  ");
        }
    }
}

