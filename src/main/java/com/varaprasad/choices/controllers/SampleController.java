package com.varaprasad.choices.controllers;

import com.varaprasad.choices.models.QuestionModel;
import com.varaprasad.choices.services.QuestionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

@Controller
@Slf4j
@RequiredArgsConstructor
public class SampleController {
    private final QuestionService questionService;

    @QueryMapping
    public Mono<QuestionModel> questionById(@Argument String id) {
        return questionService.findById(id);
    }
}
