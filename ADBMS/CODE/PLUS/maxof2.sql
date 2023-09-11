declare
num1 number := &a;
num2 number := &b;
result number;
begin
max(num1,num2,result);
DBMS_OUTPUT.PUT_LINE('The max_value is: ' || result);
end;
/