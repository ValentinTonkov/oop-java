package task1;

public class ListOfGrades {
    private int numberOfGrades;
    private final double[] grades;

    // The maximum number of grades
    private static final int MAX_NUMBER_OF_GRADES = 40;

    public ListOfGrades(){
        grades = new double[MAX_NUMBER_OF_GRADES];
        numberOfGrades = 0;
    }

    /**
     * add new grade to the list
     * @param grade this is the new grade
     * */
    public void addGrade(double grade) throws Exception {
        if (numberOfGrades < MAX_NUMBER_OF_GRADES){
            grades[numberOfGrades] = grade;
            numberOfGrades++;
        } else {
            throw new Exception("No more room for grades");
        }
    }

    /**
     * @return the list with grades
     * */
    public double[] getGrades() {
        return grades;
    }

    /**
     * @return number of grades
     * */
    public int getNumberOfGrades() {
        return numberOfGrades;
    }

    /**
     * @return average value
     * */
    public double average() {
        double sum = 0;
        for (int i = 0; i < numberOfGrades; i++){
            sum += grades[i];
        }
        return sum / numberOfGrades;
    }

    /**
     * @return String representation of the list
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < numberOfGrades - 1; i++){
            builder.append(String.format("%.2f", grades[i]));
            builder.append(", ");
        }
        builder.append(String.format("%.2f", grades[numberOfGrades - 1]));

        return builder.toString();
    }
}
