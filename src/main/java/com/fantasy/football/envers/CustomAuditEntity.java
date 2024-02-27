package com.fantasy.football.envers;

import jakarta.persistence.*;
import org.hibernate.envers.DefaultRevisionEntity;
import org.hibernate.envers.RevisionEntity;

@Entity
@Table(name = "REVINFO")
@RevisionEntity(value = CustomRevisionEntityListener.class)
@AttributeOverrides(value = {
        @AttributeOverride(
                name = "id",
                column = @Column(name = "REV")
        ),
        @AttributeOverride(
                name = "timestamp",
                column = @Column(name = "REVTSTMP")
        )
})
public class CustomAuditEntity extends DefaultRevisionEntity {

    @Column(name = "MODIFIED_BY", length = 50, updatable = false)
    private String modifiedBy;
    @Column(name = "TRACE_ID", length = 50, updatable = false)
    private String traceId;
    @Column(name = "APPLICATION_NAME", length = 50, updatable = false)
    private String applicationName;

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
}
