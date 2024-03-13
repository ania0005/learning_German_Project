package appForLearningGerman.domain;

import appForLearningGerman.domain.interfaces.Account;
import appForLearningGerman.domain.interfaces.Lesson;
import appForLearningGerman.domain.interfaces.Session;
import appForLearningGerman.domain.interfaces.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GeneralStudent implements Student {
    private static int idCounter = 1;

    private int id;
    private String name;
    private boolean isActiv;
    private String currentLevel;
    private Account account;
    private Session currentSession;


    public GeneralStudent(String name, String currentLevel) {
        this.currentLevel = currentLevel;
        this.name = name;
        this.account = new GeneralAccount(this); // Создаем экземпляр GeneralAccount
        this.isActiv = true;

    }


    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {this.id = id;}

    @Override
    public boolean getActiv() {
        return isActiv;
    }

    @Override
    public void setActiv(boolean activ) {
        this.isActiv = activ;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getCurrentLevel() {
        return this.currentLevel;
    }

    @Override
    public void setCurrentLevel(String level) {
          this.currentLevel = level;
    }

    @Override
    public Account getAccount() {
        return account;
    }

    @Override
    public void addLessonToSession(Lesson lesson) {currentSession.addLessonToSession(lesson);}

    @Override
    public Session getCurrentSession() {
        return currentSession;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeneralStudent that = (GeneralStudent) o;
        return id == that.id && isActiv == that.isActiv && Objects.equals(name, that.name) && Objects.equals(currentLevel, that.currentLevel) && Objects.equals(account, that.account) && Objects.equals(currentSession, that.currentSession) && Objects.equals(sessions, that.sessions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, isActiv, currentLevel, account, currentSession, sessions);
    }

    @Override
    public String toString() {
        return "GeneralStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isActiv=" + isActiv +
                ", level='" + currentLevel + '\'' +
                ", account=" + account +
                ", currentSession=" + currentSession +
                '}';
    }
}
