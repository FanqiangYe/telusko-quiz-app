package com.fanqiangye.quizapp.repositories;

import com.fanqiangye.quizapp.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDAO extends JpaRepository<Question, Integer> {

}
