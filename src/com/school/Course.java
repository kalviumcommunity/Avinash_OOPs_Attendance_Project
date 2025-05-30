package com.school;

public class Course {
    private static int nextCourseIdCounter = 101;

    int courseId; // Changed to int
    String courseName;

    // Constructor
    public Course(String courseName) {
        this.courseId = nextCourseIdCounter++; // Auto-increment and assign ID
        this.courseName = courseName;          // Assign course name
    }

    public void displayDetails() {
        System.out.println("Course ID: C" + this.courseId + ", Name: " + this.courseName);
    }
}
