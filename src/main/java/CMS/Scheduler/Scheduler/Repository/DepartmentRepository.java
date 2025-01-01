package CMS.Scheduler.Scheduler.Repository;

import CMS.Scheduler.Scheduler.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
