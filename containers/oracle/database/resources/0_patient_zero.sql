ALTER SESSION SET CURRENT_SCHEMA = SYSTEM;
CREATE USER &1 IDENTIFIED BY "&2";
GRANT CREATE SESSION TO &1;
-- We are creating Doomsday, not a good idea, but it will do for now, which is for learning purposes
GRANT ALL PRIVILEGES TO &1;
ALTER SESSION SET CURRENT_SCHEMA = &1;
CREATE TABLE BOOKS_T
(
    id NUMBER,
    title VARCHAR2(100),
    author VARCHAR2(100),
    published VARCHAR2(1),
    edition NUMBER,
    year NUMBER
);
INSERT INTO BOOKS_T (id, title, author, published, edition, year) VALUES (1, 'Cracking The Coding Interview', 'Gayle Laakmann McDowell', 'Y', 6, 2023);
INSERT INTO BOOKS_T (id, title, author, published, edition, year) VALUES (2, 'Silent Spring', 'Netflix', 'Y', 2, 2024);
INSERT INTO BOOKS_T (id, title, author, published, edition, year) VALUES (3, 'Solo Leveling', 'N/A', 'Y', 1, 2024);
INSERT INTO BOOKS_T (id, title, author, published, edition, year) VALUES (4, 'Harry Potter 6', 'J.K.Rowling', 'N', 7, 2024);
