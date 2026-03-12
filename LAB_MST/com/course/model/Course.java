package com.course.model;
public class Course {
    private int courseId;
    private String courseName;
    private int maxSeats;
    private Student[] enrolledStudents;
    private int count;
    public Course(int courseId, String courseName, int maxSeats) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.maxSeats = maxSeats;
        this.enrolledStudents = new Student[maxSeats];
        this.count = 0;
    }
    public int getCourseId() {
        return courseId;
    }
    public String getCourseName() {
        return courseName;
    }
    public int getMaxSeats() {
        return maxSeats;
    }
    public Student[] getEnrolledStudents() {
        return enrolledStudents;
    }
    public int getCount() {
        return count;
    }
    public void addStudent(Student s) {
        if (count < maxSeats) {
            enrolledStudents[count] = s;
            count++;
        }
    }
    public void displayCourse() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Max Seats: " + maxSeats);
        System.out.println("Enrolled Students: " + count);
    }
}