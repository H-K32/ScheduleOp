package CMS.Scheduler.Scheduler.Repository;

import CMS.Scheduler.Scheduler.Model.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
}
