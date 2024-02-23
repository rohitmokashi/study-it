package studyit.backend.models;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "StudentResponses")
public class StudentResponses {
    @DBRef
    private Student student;
    @DBRef
    private Quiz quiz;

    private boolean given;

    private int marks;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public boolean isGiven() {
        return given;
    }

    public void setGiven(boolean given) {
        this.given = given;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public StudentResponses() {
    }

    public StudentResponses(int marks) {
        if(given){
            this.marks = marks;
        }    
    }

    public StudentResponses(boolean given, int marks) {
        this.given = given;
        this.marks = marks;
    }
    public StudentResponses(Student student, Quiz quiz, boolean given, int marks) {
        this.student = student;
        this.quiz = quiz;
        this.given = given;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "StudentResponses [Student=" + student + ", Quiz=" + quiz + ", given=" + given + ", marks=" + marks
                + "]";
    }

    
}

