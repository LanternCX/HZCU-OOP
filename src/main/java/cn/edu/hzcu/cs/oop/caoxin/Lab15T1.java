package cn.edu.hzcu.cs.oop.caoxin;

class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String toString() {
        return "Class: Person, Name: " + name;
    }
}

class Student extends Person {
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String status;

    public Student(String name, String address, String phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    public String toString() {
        return "Class: Student, Name: " + super.toString().split(", ")[1].substring(6);
    }
}

class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String email,
                    String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String toString() {
        return "Class: Employee, Name: " + super.toString().split(", ")[1].substring(6);
    }
}

class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email,
                   String office, double salary, MyDate dateHired,
                   String officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String toString() {
        return "Class: Faculty, Name: " + super.toString().split(", ")[1].substring(6);
    }
}

class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String email,
                 String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    public String toString() {
        return "Class: Staff, Name: " + super.toString().split(", ")[1].substring(6);
    }
}

public class Lab15T1 {
    public static void main(String[] args) {
        Person person = new Person("Alice", "Hangzhou", "123456", "alice@hzcu.edu");
        Student student = new Student("Bob", "Beijing", "234567", "bob@hzcu.edu", Student.SOPHOMORE);
        Employee employee = new Employee("Charlie", "Shanghai", "345678", "charlie@hzcu.edu",
                "A101", 5500, new MyDate(2021, 9, 1));
        Faculty faculty = new Faculty("David", "Nanjing", "456789", "david@hzcu.edu",
                "B202", 7800, new MyDate(2019, 2, 15),
                "9:00-17:00", "Professor");
        Staff staff = new Staff("Eve", "Guangzhou", "567890", "eve@hzcu.edu",
                "C303", 5000, new MyDate(2022, 7, 10),
                "Administrator");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
