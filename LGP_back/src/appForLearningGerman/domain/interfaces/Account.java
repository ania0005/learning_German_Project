package appForLearningGerman.domain.interfaces;

import java.util.List;

public interface Account {
    int getId();

    Student getStudent();
    void setStudent(Student student);
    List<Lesson> getLessons();
    void addLesson(Lesson lesson);


}
