package appForLearningGerman.domain;

import appForLearningGerman.domain.interfaces.Lesson;

import java.util.Map;
import java.util.Objects;

public class GeneralLesson implements Lesson {
    private int id;
    private String title;
    private String content;
    private String exercises;
    private int point;

    public GeneralLesson(int id, String title, String content, String exercises) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.exercises = exercises;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getContent() {
        return this.content;
    }

    @Override
    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public int getPoint() {
        return this.point;
    }

    public String getExercises() {
        return this.exercises;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeneralLesson that = (GeneralLesson) o;
        return id == that.id && point == that.point && Objects.equals(title, that.title) && Objects.equals(content, that.content) && Objects.equals(exercises, that.exercises);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, content, exercises, point);
    }

    @Override
    public String toString() {
        return String.format("%d. %s, point - %d", id, title, point);
    }
}