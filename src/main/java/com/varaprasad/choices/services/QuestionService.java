package com.varaprasad.choices.services;

import com.varaprasad.choices.models.QuestionModel;
import com.varaprasad.choices.repos.QuestionRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@Slf4j
@RequiredArgsConstructor
public class QuestionService {
    private final QuestionRepo questionRepo;

    public Mono<QuestionModel> findById(String id) {
        return questionRepo.findById(new ObjectId(id));
    }
}
