ALTER SESSION SET CURRENT_SCHEMA = SYSTEM;

CREATE USER PATIENT_0 IDENTIFIED BY "User0@1919#";
GRANT CREATE SESSION TO PATIENT_0;
GRANT ALL PRIVILEGES TO PATIENT_0; -- We are creating Doomsday, not a good idea, but it will do for now, which is for learning purposes

ALTER SESSION SET CURRENT_SCHEMA = PATIENT_0;

DROP TABLE PATIENT_0.BOOKS_T;

CREATE TABLE PATIENT_0.BOOKS_T
(
    id NUMBER,
    title VARCHAR2(100),
    author VARCHAR2(100),
    published VARCHAR2(1),
    edition NUMBER,
    year NUMBER
);
COMMIT;

INSERT INTO PATIENT_0.BOOKS_T (id, title, author, published, edition, year) VALUES (1, 'Cracking The Coding Interview', 'Gayle Laakmann McDowell', 'Y', 6, 2023);
INSERT INTO PATIENT_0.BOOKS_T (id, title, author, published, edition, year) VALUES (2, 'Silent Spring', 'Netflix', 'Y', 2, 2024);
INSERT INTO PATIENT_0.BOOKS_T (id, title, author, published, edition, year) VALUES (3, 'Solo Leveling', 'N/A', 'Y', 1, 2024);
INSERT INTO PATIENT_0.BOOKS_T (id, title, author, published, edition, year) VALUES (4, 'Harry Potter 6', 'J.K.Rowling', 'N', 7, 2024);

SELECT * FROM PATIENT_0.BOOKS_T;

-- Getting all available tablespaces
SELECT TABLESPACE_NAME, STATUS, CONTENTS FROM USER_TABLESPACES;


SELECT * FROM COUNTRIES;
SELECT * FROM DEPARTMENTS;
SELECT * FROM EMPLOYEES;
SELECT * FROM JOB_HISTORY;
SELECT * FROM JOBS;
SELECT * FROM LOCATIONS;
SELECT * FROM REGIONS;



