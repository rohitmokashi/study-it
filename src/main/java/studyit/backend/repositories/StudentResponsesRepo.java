package studyit.backend.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import studyit.backend.models.StudentResponses;
import studyit.backend.models.Quiz;
import studyit.backend.models.Student;

public interface StudentResponsesRepo extends MongoRepository<StudentResponses, String> {
    
    List<StudentResponses> findAllByGiven(boolean given);
    
    Optional<Student> findByStudentAndQuiz(Student student, Quiz quiz);
}

