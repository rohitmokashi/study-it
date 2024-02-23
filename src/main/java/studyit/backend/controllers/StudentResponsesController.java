package studyit.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import studyit.backend.models.StudentResponses;
import studyit.backend.services.StudentResponsesService;

@RestController
@RequestMapping(path = "")
public class StudentResponsesController {

    @Autowired
    private StudentResponsesService studentResponsesService;

    @GetMapping
    public ResponseEntity<List<StudentResponses>> getAllResponses() {
        List<StudentResponses> responses = studentResponsesService.getAllResponses();
        return new ResponseEntity<>(responses, HttpStatus.OK);
    }
    @PostMapping()
    public ResponseEntity<StudentResponses> createResponse(@RequestBody StudentResponses response) {
        StudentResponses createdResponse = studentResponsesService.createResponse(response);
        return new ResponseEntity<>(createdResponse, HttpStatus.CREATED);
    }
}
