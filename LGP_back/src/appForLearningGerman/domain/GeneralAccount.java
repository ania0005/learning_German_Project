package appForLearningGerman.domain;

import appForLearningGerman.domain.interfaces.Account;
import appForLearningGerman.domain.interfaces.Student;
import appForLearningGerman.domain.interfaces.Lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GeneralAccount implements Account {

  private static int idCounter = 1;
  private int id;
  private Student student;
  private List<Lesson> lessons;


  public GeneralAccount(Student student) {
    this.student = student;
    this.lessons = new ArrayList<>();
    this.id = idCounter++;
  }

  public int getId() {
    return id;
  }



  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  @Override
  public List<Lesson> getLessons() {
    return lessons;
  }
  public void addLesson(Lesson lesson) {
     lessons.add(lesson);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GeneralAccount that = (GeneralAccount) o;
    return id == that.id && Objects.equals(student, that.student) && Objects.equals(lessons, that.lessons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, student, lessons);
  }

  @Override
  public String toString() {
    return "GeneralAccount{" +
            "id=" + id +
            ", student=" + student +
            ", lessons=" + lessons +
            '}';
  }
}
