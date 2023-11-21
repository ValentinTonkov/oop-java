package task1;

import java.util.Arrays;

public class Group {
    private int course;
    private String spec;
    private int numberOfStudents;
    private final Student[] students;
    private static final int MAX_NUMBER_OF_STUDENTS = 15;

    /**
     * Here the array of students is initialized
     * @param spec The speciality of the group
     * @param course The course of the group
     */
    public Group(String spec, int course){
        this.spec = spec;
        this.course = course;
        numberOfStudents = 0;
        students = new Student[MAX_NUMBER_OF_STUDENTS];
    }

    public Group(String spec, int course, Student[] students, int numberOfStudents){
        this.spec = spec;
        this.course = course;
        this.numberOfStudents = numberOfStudents;
        this.students = students;
    }


    /**
     * Adding a new student to the group
     * @param student Student to add to the group
     */
    public void addStudent(Student student) throws Exception {
        if (numberOfStudents < MAX_NUMBER_OF_STUDENTS) {
            students[numberOfStudents] = student;
            numberOfStudents++;
        } else {
            throw new Exception("Max number of students reached!");
        }
    }

    /**
     *
     * @return Grade point average of the group
     */
    public double average(){
        double sum = 0;
        for (int i = 0; i < numberOfStudents; i++){
            sum += students[i].average();
        }
        return sum / numberOfStudents;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public Student[] getStudents() {
        return students;
    }

    /**
     *
     * @return String representation of the group
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append('\'').append(spec).append("' course=").append(course).append(", numberOfStudents=").append(numberOfStudents).append(String.format(", average=%.2f", average())).append(", students: \n");
        for (int i = 0; i < numberOfStudents; i++){
            builder.append(students[i]).append('\n');
        }
        return builder.toString();
    }
}
