import java.util.HashSet;
import java.util.Set;

/**
 * Represents a course which can have one teacher and zero or more students.
 *
 * TODO: Do we want to be able to change the teacher after creating this?
 * TODO: Do we want the list of students to be immutable? Probably not.
 * TODO: Do we want multiple instructors per
 */
public class Course {
    private final Teacher teacher;
    private final Set<Student> students;

    public Course(Teacher teacher) {
        this.teacher = teacher;
        this.students = new HashSet<>();
    }

    public Teacher getTeacher() {
        return teacher;
    }

    /**
     * @return a copy of the list of students. Mutating the returned set will not mutate the original set on this Course.
     */
    public Set<Student> getStudents() {
        return new HashSet<>(students); // We need to copy the set, so that they don't accidentally
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public boolean isStudentEnrolled(Student student) {
        return getStudents().contains(student);
    }
}
