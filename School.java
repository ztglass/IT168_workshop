package school.management.system;


/**
 * Many teachers, many students.
 * Implements teachers and student
 * using an ArrayList.
 * Created by Rakshith on 4/3/2017.
 */
public class School {
    private Teacher[] teachers = new Teacher[5];
    private Student[] students = new Student[5];
    private int countOfTeachers = 0;
    private int countOfStudents = 0;
    private static int  totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school object is created.
     * @param teachers list of teachers in the school.
     * @param students list of students int the school.
     */
    public School(Teacher[] teachers, Student[] students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    /**
     *
     * @return the list of teachers int the school.
     */
    public Teacher[] getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to the school.
     * @param teacher the teacher to be added.
     */
    public void addTeacher(Teacher teacher) {
        if (countOfTeachers == teachers.length)
        {
            teachers = resizeTeacher();
        }

        teachers[countOfTeachers] = teacher;
        countOfTeachers++;
    }

    /**
     *
     * @return the list of students in the school.
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * Adds a student to the school
     * @param student the student to be added.
     */
    public void addStudent(Student student) {
        if (countOfStudents == teachers.length)
        {
            students = resizeStudent();
        }

        students[countOfStudents] = student;
        countOfStudents++;
    }

    private Teacher[] resizeTeacher()
    {
        Teacher[] temp = new Teacher[countOfTeachers * 2];

        for (int i = 0; i < countOfTeachers; i++)
        {
            temp[i] = teachers[i];
        }

        return temp;
    }

    private Student[] resizeStudent()
    {
        Student[] temp = new Student[countOfStudents * 2];

        for (int i = 0; i < countOfStudents; i++)
        {
            temp[i] = students[i];
        }

        return temp;
    }

    /**
     *
     * @return the total money earned by the school.
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school.
     * @param MoneyEarned money that is supposed to be  added.
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return the total money spent by the school.
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money that is spent by the school which
     * is the salary given by the school to its teachers.
     * @param moneySpent the money spent by school.
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned-=moneySpent;
     }
}
