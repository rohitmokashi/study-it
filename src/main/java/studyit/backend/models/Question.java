package studyit.backend.models;

import java.util.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Question")
public class Question {
    @Id
    private String _id;
    private String questions;
    private List<String> options;
    private int answer;

    public Question(String _id, String questions, List<String> options, int answer) {
        this._id = _id;
        this.questions = questions;
        this.options = options;
        this.answer = answer;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

}
