
DECLARE
  n NUMBER;
  i NUMBER;
  f NUMBER := 1; 
  
BEGIN

  n := &n;
  
 
  for i in 1..n LOOP
    f := f * i;
  end loop;
  

  dbms_output.put_line(n ||'! = ' || f);
END;
/

