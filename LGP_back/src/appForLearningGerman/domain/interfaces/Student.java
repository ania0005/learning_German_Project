package appForLearningGerman.domain.interfaces;

import java.util.List;

public interface Student {
    int getId();
    void setId(int id);
    boolean getActiv();
    void setActiv(boolean activ);
    String getName();
    void setName(String name);
    String getCurrentLevel();
    void setCurrentLevel(String level);
    Account getAccount();
    List<Session> getSessions();

    List<Lesson> makeSession();
    void addLessonToSession(Lesson lesson);
    Session getCurrentSession();

}
