package service;

import model.Student;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void initializeStudents() {
        // TODO: Add at least 5 students
        students.add(new Student(1, "Ilhanlox", 3.7));
        students.add(new Student(2, "Ilhanlox2", 2.3));
        students.add(new Student(3, "Ilhanlox3", 1.7));
        students.add(new Student(4, "Ilhanlox4", 2.7));
        students.add(new Student(5, "Ilhanlox5", 2.6));

    }

    public void removeLowGPA() {
        // TODO: Remove students with GPA < 2.0
        Iterator<Student> its = students.iterator();
        while(its.hasNext()){
            Student s = its.next();
            if(s.getGpa() < 2.0){
                its.remove();
            }

        }
        System.out.println("Students with gpa lower than 2.0 removed");

    }

    public void findHighestGPA() {
        // TODO: Find and print student with highest GPA
        Student highest = null;
        for (Student s : students) {
            if (highest == null || s.getGpa() > highest.getGpa()) {
                highest = s;
            }
        }
        if (highest != null) {
            System.out.println("Student with highest GPA: " + highest);
        } else {
            System.out.println("No students found.");
        }
    }

    public void insertAtIndex() {
        // TODO: Insert new student at index 2
        students.add(2, new Student(6, "NewStudent", 3.5));
        System.out.println("New student inserted at index 2.");
    }

    public void printStudents() {
        // TODO: Print using Iterator
        System.out.println("=== Student List ===");
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            System.out.println("--------------------");
        }
    }
}
