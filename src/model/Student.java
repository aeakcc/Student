package model;

import courses.*;

import java.util.ArrayList;

public class Student {
    private String name;
    private String lastname;
    private int classLevel;
    private String id;
    private int Balance;

    private ArrayList<Course> courses = new ArrayList<>();

    public void generateId() {
        this.id = (classLevel + "" + (int) (Math.random() * 10) + "" + (int) (Math.random() * 10) + "" +
                (int) (Math.random() * 10) + "" + (int) (Math.random() * 10));
    }

    public void courseToEnroll(String courseName) {
        switch (courseName) {
            case "English101":
                courses.add(new English());
                break;
            case "Math101":
                courses.add(new Math1());
                break;
            case "History101":
                courses.add(new History());
                break;
            case "Chemistry101":
                courses.add(new Chemistry());
                break;
            case "Informatics101":
                courses.add(new Informatics());
                break;
            case "q":
                break;
            default:
                System.out.println("There is no such course");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getClassLevel() {
        return classLevel;
    }

    public void setClassLevel(int classLevel) {
        this.classLevel = classLevel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }
    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
