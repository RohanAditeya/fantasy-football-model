CREATE TABLE LEAGUE_TEAM (
    PULSE_ID INTEGER,
    SHRT_NAME VARCHAR(3),
    STRGTH INTEGER,
    STRGTH_ATT_AWAY INTEGER,
    STRGTH_ATT_HOME INTEGER,
    STRGTH_DEF_AWAY INTEGER,
    STRGTH_DEF_HOME INTEGER,
    STRGTH_OVR_AWAY INTEGER,
    STRGTH_OVR_HOME INTEGER,
    UN_AVLBL BOOLEAN,
    CODE INTEGER NOT NULL UNIQUE,
    DRAW INTEGER NOT NULL,
    FORM FLOAT(24) NOT NULL,
    LOSS INTEGER NOT NULL,
    PLAYED INTEGER NOT NULL,
    POINTS INTEGER NOT NULL,
    POSITION INTEGER NOT NULL,
    WIN INTEGER NOT NULL,
    VERSION_NUMBER BIGINT NOT NULL,
    TEAM_DIV VARCHAR(10),
    RECORD_ID UUID NOT NULL UNIQUE,
    NAME VARCHAR(30) NOT NULL,
    PRIMARY KEY (RECORD_ID, CODE, NAME),
    UNIQUE (SHRT_NAME)
);

CREATE TABLE PLYR_BSC_INFO (
    PLYR_STS CHAR(1),
    SQD_NO INTEGER,
    CODE BIGINT NOT NULL,
    VERSION_NUMBER BIGINT NOT NULL,
    WEB_NAME VARCHAR(15),
    PLYR_FANT_STCS_PK UUID NOT NULL UNIQUE,
    PLYR_GAME_STCS_PK UUID NOT NULL UNIQUE,
    PLYR_MISC_INFO_PK UUID NOT NULL UNIQUE,
    TEAM_UUID UUID NOT NULL,
    RECORD_ID UUID NOT NULL,
    FRST_NAME VARCHAR(30) NOT NULL,
    SECD_NAME VARCHAR(30) NOT NULL,
    PRIMARY KEY (RECORD_ID, CODE, FRST_NAME, SECD_NAME)
);

ALTER TABLE IF EXISTS PLYR_BSC_INFO ADD CONSTRAINT FKHEN8GW9FYFC58UHKG1WBIB4DP FOREIGN KEY (TEAM_UUID) REFERENCES LEAGUE_TEAM(RECORD_ID);