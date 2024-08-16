package com.question.service;

import com.question.entity.Question;

import java.util.List;

public interface QuestionService {

    Question add(Question question);

    List<Question> get();

    Question get(Long id);

    List<Question> getQuestionsForQuiz(Long quizId);
}
