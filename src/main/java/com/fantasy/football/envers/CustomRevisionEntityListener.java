package com.fantasy.football.envers;

import org.hibernate.envers.RevisionListener;

public class CustomRevisionEntityListener implements RevisionListener {
    @Override
    public void newRevision(Object revisionEntity) {
        CustomAuditEntity customAuditEntity = (CustomAuditEntity) revisionEntity;
        customAuditEntity.setModifiedBy("USER");
        customAuditEntity.setApplicationName("app-name");
        customAuditEntity.setTraceId("trace-id");
    }
}