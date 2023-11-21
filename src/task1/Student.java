package task1;

public class Student extends Person{
    private final String fn;
    private final ListOfGrades grades;

    /**
     * Here the ListOfGrades object is initialized
     * @param name name of the student
     * @param age age of the student
     * @param fn fn of the student
     */
    public Student(String name, int age, String fn){
        setName(name);
        setAge(age);
        this.fn = fn;
        grades = new ListOfGrades();
    }

    /**
     *
     * @return Grade point average of the student
     */
    public double average(){
        return grades.average();
    }

    /**
     *
     * @param grade grade of the course passed
     */
    public void passExam(double grade) throws Exception {
        grades.addGrade(grade);
    }


    @Override
    public String toString() {
        return super.toString() + " fn: " +
                fn + ", grades: " + grades.toString();
    }
}
