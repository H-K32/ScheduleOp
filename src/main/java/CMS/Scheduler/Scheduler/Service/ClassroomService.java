package CMS.Scheduler.Scheduler.Service;

import CMS.Scheduler.Scheduler.Model.Classroom;
import CMS.Scheduler.Scheduler.Repository.ClassroomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomService {
    private final ClassroomRepository classroomRepository;

    public ClassroomService(ClassroomRepository classroomRepository) {
        this.classroomRepository = classroomRepository;
    }

    public List<Classroom> getAllClassrooms() {
        return classroomRepository.findAll();
    }

    public Classroom createClassroom(Classroom classroom) {
        return classroomRepository.save(classroom);
    }
}
