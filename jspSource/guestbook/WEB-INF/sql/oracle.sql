create sequence guestbook_seq 
increment by 1
start with 1
nocycle;

create table GUESTBOOK (
    GUESTBOOK_ID NUMBER       NOT NULL,
    REGISTER     DATE         NOT NULL,
    NAME         VARCHAR2(20) NOT NULL,
    EMAIL        VARCHAR2(40) NOT NULL,
    PASSWORD     VARCHAR2(10),
    CONTENT      LONG         NOT NULL,
    CONSTRAINT GUESTBOOK_PK PRIMARY KEY (GUESTBOOK_ID)
);