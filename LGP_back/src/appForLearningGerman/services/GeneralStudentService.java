package appForLearningGerman.services;



import appForLearningGerman.domain.interfaces.Student;
import appForLearningGerman.repositories.GeneralStudentRepository;

import java.util.List;

public class GeneralStudentService {
    private GeneralStudentRepository studentRepository;

    public GeneralStudentService(GeneralStudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
}
