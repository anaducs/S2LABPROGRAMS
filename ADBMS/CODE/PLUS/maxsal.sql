declare 
m number;
begin
m := maxsal();
DBMS_OUTPUT.PUT_LINE('The max salary is: ' || m);
end;
/