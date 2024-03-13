
import appForLearningGerman.domain.interfaces.Lesson;
import appForLearningGerman.domain.interfaces.Session;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

    public class GeneralSession implements Session {

        private int id;
        private LocalDateTime dateTime;
        private List<Lesson> lessonsInSession = new ArrayList<>();

        public GeneralSession() {
            this.dateTime = LocalDateTime.now();
        }

        @Override
        public int getId() {
            return this.id;
        }

        @Override
        public List<Lesson> getLessonsInSession() {
            return lessonsInSession;
        }

        @Override
        public boolean addLessonToSession(Lesson lesson) {
            return lessonsInSession.add(lesson);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            GeneralSession that = (GeneralSession) o;
            return id == that.id && Objects.equals(dateTime, that.dateTime) && Objects.equals(lessons, that.lessons);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, dateTime, lessons);
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("Training: \n").append(String.format("%tT\n", dateTime));
            for (int i = 0; i < lessons.size(); i++) {
                builder.append("N. ").append(i + 1).append(" ").append(lessons.get(i).toString()).append("\n");
            }
            return builder.toString();
        }
    }

