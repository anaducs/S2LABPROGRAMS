declare 
  a NUMBER := 0
  b NUMBER := 1;
  c number;
  
BEGIN
  dbms_output.put_line(a || ''|| b || '');
for i in 3..10 loop
c := a + b;
 dbms_output.put_line(c ||'');
a :=b;
b : c;
 end loop;
 dbms_output.put_line('');
end;
/