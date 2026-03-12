package com.course.main;

import com.course.model.Course;
import com.course.model.Student;
import com.course.service.CourseService;
import com.course.exception.CourseFullException;
import com.course.exception.CourseNotFoundException;
import com.course.exception.DuplicateEnrollmentException;

public class Main {

    public static void main(String[] args) {

        CourseService service = new CourseService();

        Course c1 = new Course(1, "Java", 2);
        Course c2 = new Course(2, "DSA", 2);

        service.addCourse(c1);
        service.addCourse(c2);

        try {

            service.enrollStudent(1, new Student(101, "Rahul"));
            service.enrollStudent(1, new Student(102, "Aman"));

            service.enrollStudent(1, new Student(103, "Riya"));

        } catch (CourseFullException e) {
            System.out.println(e.getMessage());
        } catch (CourseNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (DuplicateEnrollmentException e) {
            System.out.println(e.getMessage());
        }

        service.viewCourses();
    }
}