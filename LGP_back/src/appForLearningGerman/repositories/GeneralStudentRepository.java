package appForLearningGerman.repositories;

import appForLearningGerman.domain.interfaces.Student;

import java.util.List;

public interface GeneralStudentRepository {
    List<Student> getAllStudents();

    Student getStudentById(int id);

    // Другие методы, если необходимо
}
