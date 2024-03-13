package appForLearningGerman.domain.interfaces;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface Session {
    List<Lesson> getLessons();
    String getResult();
    void setResult(String result);
    LocalDateTime getDateTime();
    int getId();
    List<Lesson> getLessonsInSession();
    boolean addLessonToSession(Lesson lesson);

}
