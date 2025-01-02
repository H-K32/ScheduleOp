package CMS.Scheduler.Scheduler.Model;

 

import jakarta.persistence.*;
import java.time.LocalTime;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;

    private String courseName;

    @ManyToOne
    @JoinColumn(name = "department_id") // Assuming a foreign key column for department
    private Department department;

    private String day; // Change this to String to match the frontend
    private LocalTime time; // Keep this as LocalTime for time representation

    @ManyToOne
    @JoinColumn(name = "classroom_id") // Assuming a foreign key column for classroom
    private Classroom classroom;

    // Getters and Setters
    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
}