package com.varaprasad.choices.repos;

import com.varaprasad.choices.models.QuestionModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepo extends ReactiveMongoRepository<QuestionModel, ObjectId> {
}
