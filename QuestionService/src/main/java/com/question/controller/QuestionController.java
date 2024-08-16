package com.question.controller;

import com.question.entity.Question;
import com.question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping
    private Question create(@RequestBody Question question){

        return questionService.add(question);
    }

    @GetMapping
    private List<Question> getAll(){

        return questionService.get();
    }

    @GetMapping("/{questionId}")
    private Question getById(@PathVariable Long questionId){

        return questionService.get(questionId);
    }

    @GetMapping("/quiz/{quizId}")
    private List<Question> getQuestionsForQuiz(@PathVariable Long quizId){

        return questionService.getQuestionsForQuiz(quizId);
    }
}
