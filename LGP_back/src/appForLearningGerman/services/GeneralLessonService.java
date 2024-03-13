package appForLearningGerman.services;

import appForLearningGerman.domain.interfaces.Lesson;
import appForLearningGerman.repositories.GeneralLessonRepository;

import java.util.List;

public class GeneralLessonService {
    private GeneralLessonRepository lessonRepository;

    public GeneralLessonService(GeneralLessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    // Реализация методов, если необходимо
}
