BEGIN
    EXECUTE IMMEDIATE 'DROP TABLE student';
    
    EXECUTE IMMEDIATE 'CREATE TABLE student (
        id NUMBER(10) PRIMARY KEY,
        name VARCHAR2(30),
        mark NUMBER(15)
    )';
END;
/
