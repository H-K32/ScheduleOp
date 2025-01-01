package CMS.Scheduler.Scheduler;

import CMS.Scheduler.Scheduler.Model.Classroom;
import CMS.Scheduler.Scheduler.Model.Department;
import CMS.Scheduler.Scheduler.Repository.ClassroomRepository;
import CMS.Scheduler.Scheduler.Repository.DepartmentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initDatabase(ClassroomRepository classroomRepository, DepartmentRepository departmentRepository) {
        return args -> {
            Classroom classroom1 = new Classroom();
            classroom1.setName("Room 101");
            classroomRepository.save(classroom1);

            Department department1 = new Department();
            department1.setName("Computer Science");
            departmentRepository.save(department1);
        };
    }
}
