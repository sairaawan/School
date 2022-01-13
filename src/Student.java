import java.util.Arrays;

public class Student {
    private String name;
    private static char grade;
    private static int group;
    private final String NICKNAME = "MySecretNickName";

    public Student(String name, char grade, int group) {
        this.name = name;
        this.grade = grade;
        this.group = group;
    }

    private char getGrade() {
        return grade;
    }

    private String getName() {
        return name;
    }

    public void upgrade() {
        if (this.grade == 'F') {
            this.grade = 'E';
        }
        if (this.grade == 'E') {
            this.grade = 'D';
        }
        if (this.grade == 'D') {
            this.grade = 'C';
        }
        if (this.grade == 'C') {
            this.grade = 'B';
        }
        if (this.grade == 'B') {
            this.grade = 'A';
        }

    }

    public void downgrade() {
        if (this.grade == 'E') {
            this.grade = 'F';
        }
        if (this.grade == 'D') {
            this.grade = 'E';
        }
        if (this.grade == 'C') {
            this.grade = 'D';
        }
        if (this.grade == 'B') {
            this.grade = 'C';
        }
        if (this.grade == 'A') {
            this.grade = 'B';
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", group=" + group +
                '}';
    }

    public static void main(String[] args) {

        Student s1 = new Student("saira", 'A', 4);
        if (grade != 'A' && grade != 'B' && grade != 'C' && grade != 'D' && grade != 'E'&& grade != 'F') {
            System.out.println("Grades are incorrect.Try again.");

        } else if (group != 1 && group != 2 && group != 3 && group != 4 && group != 5) {
            System.out.println("Group is incorrect.Try again.");
        } else {
            System.out.println(s1);
            s1.downgrade();
            System.out.println("Downgrade " + s1);
            s1.upgrade();
            System.out.println("Upgrade " + s1);

        }



    }

}