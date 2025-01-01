package CMS.Scheduler.Scheduler.Repository;

import CMS.Scheduler.Scheduler.Model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    List<Schedule> findByCourseDepartmentId(Long departmentId);
}