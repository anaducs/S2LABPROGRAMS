
DECLARE
  n NUMBER;
  r NUMBER;
  s NUMBER := 0; 
  
BEGIN

  n := &n;
while n <> 0 loop
r := mod(n,10);
s := s + r;
n := trunc(n/10);
end loop;
  

dbms_output.put_line('sum of digits = ' || s);
END;
/

