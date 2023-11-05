package controller;

import model.Student;
import view.ConsoleView;
import java.util.Scanner;

public class Controller {
    Student student = new Student();
    Scanner scan = new Scanner(System.in);

    public void creatingStudent() {
        student.setBalance(2000);
        student.generateId();
    }

    public void inputFirstName() {
        ConsoleView.setInputFirstName();
        String name = scan.nextLine();
        student.setName(name);
    }

    public void inputLastName() {
        ConsoleView.setInputLastName();
        String lastName = scan.nextLine();
        student.setLastname(lastName);
    }

    public void inputClassLevel() {
        ConsoleView.setFreshmen();
        ConsoleView.setSophmore();
        ConsoleView.setJunior();
        ConsoleView.setSenior();
        ConsoleView.setClassLevel();
        int classLevel = scan.nextInt();
        student.setClassLevel(classLevel);
        ConsoleView.student(student);
        String temp = scan.nextLine();
    }

    public void inputCourse() {
        boolean stillTrue = true;
        while (stillTrue) {
            ConsoleView.setCourseToEnroll();
            String inputCourse = scan.nextLine();
            student.courseToEnroll(inputCourse);
            if (inputCourse.equals("q")) stillTrue = false;
        }
        ConsoleView.setBreak();
    }

    public void payment() {
        ConsoleView.setBalance(student);
        ConsoleView.setPayment();
        int payment = scan.nextInt();
        ConsoleView.setThanksForPayment(payment);
        student.setBalance(student.getBalance() - payment);
    }

    public void allStats(){
        ConsoleView.allStatistics(student);
    }
}
