package CMS.Scheduler.Scheduler.Service;

import CMS.Scheduler.Scheduler.Model.Schedule;
import CMS.Scheduler.Scheduler.Repository.ScheduleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {
    private final ScheduleRepository scheduleRepository;

    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    public List<Schedule> getSchedulesByDepartment(Long departmentId) {
        return scheduleRepository.findByCourseDepartmentId(departmentId);
    }

    // Additional methods for generating schedules can be implemented here
}