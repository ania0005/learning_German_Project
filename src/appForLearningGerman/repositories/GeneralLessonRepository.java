package appForLearningGerman.repositories;

import appForLearningGerman.domain.interfaces.Lesson;

import java.util.List;

public interface GeneralLessonRepository {
    List<Lesson> getAllLessons();

    Lesson getLessonById(int id);

    // Другие методы, если необходимо
}
