package studyit.backend.models;

import java.util.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Quiz")
public class Quiz {

    @Id
    private String _id;
    private String quizName;
    @DBRef
    private List<Subject> subject;
    @DBRef
    private List<Question> questions;
    private int totalQuestions;

    public Quiz(String _id, String quizName, List<Subject> subject, List<Question> questions, int totalQuestions) {
        this._id = _id;
        this.quizName = quizName;
        this.subject = subject;
        this.questions = questions;
        this.totalQuestions = totalQuestions;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public List<Subject> getSubject() {
        return subject;
    }

    public void setSubject(List<Subject> subject) {
        this.subject = subject;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

}
