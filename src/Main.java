import task1.*;
import task2.*;
import task3.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task1 \n");
        task1Example();

        System.out.println("\n Task2");
        task2Example();

        System.out.println("\n Task3");
        task3Example();
    }

    public static void task1Example(){

        /*
         * Task1 demonstration
         * */

        Student student1 = new Student("Ivan Ivanov", 25, "1234566");
        Student student2 = new Student("Maria Ivanova", 26, "1236346");
        Student student3 = new Student("Stoyan Stoyanov", 23, "8297566");
        Student student4 = new Student("Yordan Yordanov", 24, "1934566");
        Student student5 = new Student("Georgi Georgiev", 25, "1237314");

        Student[] students = {student1, student2, student3, student4, student5};

        Random r = new Random();

        try {
            for (Student s :
                    students) {
                s.passExam(4 + r.nextDouble(2));
                s.passExam(3 + r.nextDouble(3));
                s.passExam(3 + r.nextDouble(3));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // creating two groups by using different constructors
        Group group2 = new Group("Computer Science", 3, students, 5);
        Group group = new Group("Software Engineers", 2);

        try {
            // filling the group with students
            group.addStudent(student1);
            group.addStudent(student2);
            group.addStudent(student3);
            group.addStudent(student4);
            group.addStudent(student5);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(group);
        System.out.println(group2);
    }

    public static void task2Example(){
        Cylinder cylinder1 = new Cylinder("cylinder1", 10, 30);
        Cylinder cylinder2 = new Cylinder("cylinder2", 20, 40);
        Rectangle rectangle1 = new Rectangle("Rectangle1", 4, 5);
        Rectangle rectangle2 = new Rectangle("Rectangle2", 18, 33);

        Figure[] figures = new Figure[4];
        figures[0] = cylinder1;
        figures[1] = cylinder2;
        figures[2] = rectangle1;
        figures[3] = rectangle2;

        for (Figure f :
                figures) {
            System.out.printf("%s area: %.2f\n", f.getName(), f.getArea());
        }
    }

    public static void task3Example(){
        Vehicle[] vehicles = {
                new Car("Opel", "red", 2, 130),
                new Car("Mercedes", "white", 4, 163),
                new Bus("VW", "blue", 4, 150),
                new Truck("Volvo", "yellow", 6, 30),
                };

        for (Vehicle v :
                vehicles) {
            AbstractVehicle aV = (AbstractVehicle)v;
            System.out.printf("%s, color: %s, number wheels: %s, start driving: \n", aV.getName(), aV.getColor(), aV.getNumberOfWheels());
            v.drive();
            System.out.println();
        }
    }
}