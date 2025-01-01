package CMS.Scheduler.Scheduler.Repository;

import CMS.Scheduler.Scheduler.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
