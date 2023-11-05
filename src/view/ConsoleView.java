package view;

import courses.*;
import model.Student;

public class ConsoleView {
    private static final String NUMBER_OF_NEW_STUDENTS = "Enter the number of new students to enroll:";
    private static final String INPUT_FIRST_NAME = "Enter student first name:";
    private static final String INPUT_LAST_NAME = "Enter student last name:";
    private static final String FRESHMEN = "1 - Freshmen";
    private static final String SOPHMORE = "2 - Sophmore";
    private static final String JUNIOR = "3 - Junior";
    private static final String SENIOR = "4 - Senior";
    private static final String CLASS_LEVEL = "Enter student class level:";
    private static final String COURSE_TO_ENROLL = "Enter course to enroll (Q to quit):";
    private static final String BREAK = "BREAK!";
    private static final String BALANCE = "Your balance is: ";
    private static final String PAYMENT = "Enter your payment: ";
    private static final String THANKS_FOR_PAYMENT = "Thank you for your payment of ";
    private static final String NAME = "Name: ";
    private static final String GRADE_LEVEL = "Grade level: ";
    private static final String ID = "ID: ";
    private static final String COURSES_ENROLLED = "Courses Enrolled:";
    private static final String BALANCE_STATS = "Balance: ";

    public static void setNumberOfNewStudents() {
        System.out.println(NUMBER_OF_NEW_STUDENTS);
    }

    public static void setInputFirstName() {
        System.out.println(INPUT_FIRST_NAME);
    }

    public static void setInputLastName() {
        System.out.println(INPUT_LAST_NAME);
    }

    public static void setFreshmen() {
        System.out.println(FRESHMEN);
    }

    public static void setSophmore() {
        System.out.println(SOPHMORE);
    }

    public static void setJunior() {
        System.out.println(JUNIOR);
    }

    public static void setSenior() {
        System.out.println(SENIOR);
    }

    public static void setClassLevel() {
        System.out.println(CLASS_LEVEL);
    }

    public static void setCourseToEnroll() {
        System.out.println(COURSE_TO_ENROLL);
    }

    public static void setBreak() {
        System.out.println(BREAK);
    }

    public static void setBalance(Student student) {
        System.out.println(BALANCE + student.getBalance());
    }

    public static void setPayment() {
        System.out.println(PAYMENT);
    }

    public static void setThanksForPayment(int payment) {
        System.out.println(THANKS_FOR_PAYMENT + payment);
    }

    public static void setName(Student student) {
        System.out.println(NAME + student.getName() + " " + student.getLastname());
    }

    public static void setGradeLevel(Student student) {
        System.out.println(GRADE_LEVEL + student.getClassLevel());
    }

    public static void setId(Student student) {
        System.out.println(ID + student.getId());
    }

    public static void setCoursesEnrolled() {
        System.out.println(COURSES_ENROLLED);
    }

    public static void setBalanceStats() {
        System.out.println(BALANCE_STATS);
    }

    public static void student(Student student) {
        System.out.println(student.getName() + " " + student.getLastname() + " " +
                student.getClassLevel() + " " + student.getId());
    }
    public static void allCourses(Student student){
        for(int i = 0; i < student.getCourses().size(); i++){
            if(student.getCourses().get(i).getClass().equals(Math1.class)){
                System.out.println("Math101");
            }
            if(student.getCourses().get(i).getClass().equals(Chemistry.class)){
                System.out.println("Chemistry101");
            }
            if(student.getCourses().get(i).getClass().equals(English.class)){
                System.out.println("English101");
            }
            if(student.getCourses().get(i).getClass().equals(History.class)){
                System.out.println("History101");
            }
            if(student.getCourses().get(i).getClass().equals(Informatics.class)){
                System.out.println("Informatics101");
            }
        }
    }
    public static void allStatistics(Student student){
        System.out.println(NAME + student.getName() + " " + student.getLastname());
        System.out.println(GRADE_LEVEL + student.getClassLevel());
        System.out.println(ID + student.getId());
        System.out.println(COURSES_ENROLLED);
        allCourses(student);
        System.out.println(BALANCE_STATS + student.getBalance());
    }
}
