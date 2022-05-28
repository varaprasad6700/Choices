package com.varaprasad.choices.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@EqualsAndHashCode(callSuper = true)
@Data
public class QuestionModel extends AuditMetadata {
    @Id
    private ObjectId id;
    private String question;
}
