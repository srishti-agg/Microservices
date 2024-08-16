package com.question.service.impl;

import com.question.entity.Question;
import com.question.repository.QuestionRepository;
import com.question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public Question add(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> get() {
        return questionRepository.findAll();
    }

    @Override
    public Question get(Long id) {
        return questionRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Question Not Found!!"));
    }

    @Override
    public List<Question> getQuestionsForQuiz(Long quizId) {
        return questionRepository.findByQuizId(quizId);
    }
}
