package ch.fit4me.springbootfit4me.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import ch.fit4me.springbootfit4me.model.Exercise;

@RestController
public class ExerciseController {

    @GetMapping("/exercises")
    public Exercise helloWorld(){
        Exercise exercise = new Exercise();

        exercise.setName("new Excercise");
        exercise.setDescription("descriptions");
        return exercise;
    }
    
}
