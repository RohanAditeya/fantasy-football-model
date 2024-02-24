package com.fantasy.football.model;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Positive;

import java.util.UUID;

@Embeddable
@Access(value = AccessType.FIELD)
public class PlayerBasicInformationPrimaryKey {

    private PlayerBasicInformationPrimaryKey () {}

    public PlayerBasicInformationPrimaryKey (Long code, String firstName, String secondName) {
        this(null, code, firstName, secondName);
    }

    protected PlayerBasicInformationPrimaryKey(UUID recordId, Long code, String firstName, String secondName) {
        this.recordId = recordId;
        this.firstName = firstName;
        this.code = code;
        this.secondName = secondName;
    }

    private UUID recordId;
    @Positive
    private Long code;
    @Column(name = "FRST_NAME", length = 30, nullable = false)
    private String firstName;
    @Column(name = "SECD_NAME", length = 30, nullable = false)
    private String secondName;

    public UUID getRecordId() {
        return recordId;
    }

    public Long getCode() {
        return code;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }
}