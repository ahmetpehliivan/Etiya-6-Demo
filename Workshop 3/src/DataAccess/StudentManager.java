package DataAccess;

import Entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    List<Student> students = new ArrayList<Student>();

    public void create(Student student) {
        if (isValid(student.getNationalityId(), student.getStudentNo())) {
            students.add(student);
        } else {
            System.out.println("Öğrenci kaydı mevcut.");
        }

    }

    public void studentList() {
        for (Student student : students) {
            System.out.println("Öğrenci Eklendi : "+student.getFirstName()+" "+student.getLastName());
        }
    }

    public void remove(Student student) {
        students.remove(student);
    }

    public boolean isValid(String id, int studentNo) {
        for (Student student0 : students) {
            if (student0.getNationalityId() == id && student0.getStudentNo() == studentNo) {
                return false;
            }
        }
        return true;
    }
}
