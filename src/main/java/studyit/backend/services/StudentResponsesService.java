package studyit.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import studyit.backend.models.Student;
import studyit.backend.models.StudentResponses;
import studyit.backend.repositories.StudentResponsesRepo;


@Service
public class StudentResponsesService {

    private final StudentResponsesRepo studentResponsesRepo;
    
    public StudentResponsesService(StudentResponsesRepo studentResponsesRepo) {
        this.studentResponsesRepo = studentResponsesRepo;
    }

    public List<StudentResponses> getAllResponses() {
        return studentResponsesRepo.findAll();
    }

    // public StudentResponses createResponse(StudentResponses response) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'createResponse'");
    // }

    // public void addResponse(Student student) {
    //     studentResponsesRepo.save(student);
    // }

}
