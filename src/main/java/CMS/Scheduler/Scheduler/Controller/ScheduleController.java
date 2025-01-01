package CMS.Scheduler.Scheduler.Controller;

import CMS.Scheduler.Scheduler.Model.Schedule;
import CMS.Scheduler.Scheduler.Service.ScheduleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/schedules")
public class ScheduleController {
    private final ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @GetMapping("/{departmentId}")
    public List<Schedule> getSchedulesByDepartment(@PathVariable Long departmentId) {
        return scheduleService.getSchedulesByDepartment(departmentId);
    }

    // Endpoint for generating schedules can be added here
}