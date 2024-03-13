package appForLearningGerman.domain.interfaces;

public interface Lesson {
    int getId();
    String getTitle();
    String getContent();
    void setPoint(int point);
    int getPoint();
    String toStringSessoin();
    }
