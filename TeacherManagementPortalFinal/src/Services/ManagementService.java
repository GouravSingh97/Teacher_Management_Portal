
package Services;
import java.util.ArrayList;
import java.util.List;

import Model.Parent;
import Model.Student;
import Model.Teacher;

public class ManagementService {
    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();
    private List<Parent> parents = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addParent(Parent parent) {
        parents.add(parent);
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Parent> getParents() {
        return parents;
    }
}
