package com.quiz.controller;

import com.quiz.entity.Quiz;
import com.quiz.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private QuizService quizService;

    public QuizController(QuizService quizService)
    {
        this.quizService = quizService;
    }

    //create
    @PostMapping()
    private Quiz create(@RequestBody Quiz quiz){

        return quizService.add(quiz);
    }

    @GetMapping
    private List<Quiz> getAll(){

        return quizService.get();
    }

    @GetMapping("/{id}")
    private Quiz getById(@PathVariable Long id){

        return quizService.get(id);
    }

}
