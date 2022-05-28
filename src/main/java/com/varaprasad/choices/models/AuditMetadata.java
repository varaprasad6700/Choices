package com.varaprasad.choices.models;

import lombok.Data;
import org.springframework.data.annotation.*;

import java.time.LocalDateTime;

@Data
public class AuditMetadata {
    @CreatedDate
    private LocalDateTime createdDate;
    @LastModifiedDate
    private LocalDateTime lastModifiedDate;
    @CreatedBy
    private String createdByUser;
    @LastModifiedBy
    private String modifiedByUser;
    @Version
    private Long version;
}
