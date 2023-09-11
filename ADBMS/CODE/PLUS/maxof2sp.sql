create or replace procedure max(a in number,b in number, max_value out number)
is 
begin
if a > b then 
max_value :=a;
else
max_value :=b;
end if;
end;
/