package com.varaprasad.choices.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class QuestionModel extends AuditMetadata{
    private String question;
}
