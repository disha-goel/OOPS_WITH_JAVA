package com.course.service;

import com.course.model.Course;
import com.course.model.Student;
import com.course.exception.CourseFullException;
import com.course.exception.CourseNotFoundException;
import com.course.exception.DuplicateEnrollmentException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CourseService {

    private Course[] courses = new Course[10];
    private int courseCount = 0;

    public void addCourse(Course c) {
        courses[courseCount] = c;
        courseCount++;
    }

    public void enrollStudent(int courseId, Student s)
            throws CourseFullException, CourseNotFoundException, DuplicateEnrollmentException {

        Course found = null;

        for (int i = 0; i < courseCount; i++) {
            if (courses[i].getCourseId() == courseId) {
                found = courses[i];
                break;
            }
        }

        if (found == null) {
            throw new CourseNotFoundException("Course not found");
        }

        if (found.getCount() >= found.getMaxSeats()) {
            throw new CourseFullException("Course is full");
        }

        Student[] students = found.getEnrolledStudents();

        for (int i = 0; i < found.getCount(); i++) {
            if (students[i].getStudentId() == s.getStudentId()) {
                throw new DuplicateEnrollmentException("Student already enrolled");
            }
        }

        found.addStudent(s);

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("courses.txt", true));
            bw.write(courseId + "," + s.getStudentId() + "," + s.getStudentName());
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println("File error");
        }
    }

    public void viewCourses() {

        for (int i = 0; i < courseCount; i++) {
            courses[i].displayCourse();
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("courses.txt"));
            String line;

            System.out.println("\nEnrollment Records:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("File error");
        }
    }
}