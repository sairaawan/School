import java.util.Arrays;

public class Student {
    private String name;
    private Grades grade;
    private Group group;
    private final String NICKNAME = "MySecretNickName";

    public Student(String name, Grades grade, Group value) {
        this.name = name;
        this.grade = grade;
        this.group = value;
    }

    public String getName() {
        return name;
    }

    public Grades getGrade() {
        return grade;
    }

    public void downGrade() {
        if (this.grade == Grades.A) {
            this.grade = Grades.B;
        }
        if (this.grade == Grades.B) {
            this.grade = Grades.C;
        }
        if (this.grade == Grades.C) {
            this.grade = Grades.B;
        }
        if (this.grade == Grades.D) {
            this.grade = Grades.E;
        }
        if (this.grade == Grades.E) {
            this.grade = Grades.F;
        }
        if (this.grade == Grades.F) {
            System.out.println("Downgrade not possible");
        }

    }

    public void upGrade() {
        if (this.grade == Grades.A) {
            System.out.println("Upgrade not possible");
        }
        if (this.grade == Grades.B) {
            this.grade = Grades.A;
        }
        if (this.grade == Grades.C) {
            this.grade = Grades.B;
        }
        if (this.grade == Grades.D) {
            this.grade = Grades.C;
        }
        if (this.grade == Grades.E) {
            this.grade = Grades.D;
        }
        if (this.grade == Grades.F) {
            this.grade = Grades.E;
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", group=" + group.getID() +
                '}';
    }

}