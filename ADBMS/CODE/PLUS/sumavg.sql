DECLARE
  a NUMBER := &a;
  b NUMBER := &b;
  c NUMBER := &c;
  sm NUMBER;
  av NUMBER;
BEGIN
  sm := a + b + c;
  av := sm / 3;
  DBMS_OUTPUT.PUT_LINE('The sum is: ' || sm);
  DBMS_OUTPUT.PUT_LINE('The average is: ' || av);
 
END;
/
