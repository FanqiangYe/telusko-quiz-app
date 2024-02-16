package com.fanqiangye.quizapp.services;

import com.fanqiangye.quizapp.repositories.QuestionDAO;
import com.fanqiangye.quizapp.models.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDAO questionDAO;

    public List<Question> getAllQuestions() {
       return questionDAO.findAll();
        }


}