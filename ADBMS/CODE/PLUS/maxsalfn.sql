create or replace function maxsal return number
is 
maximum number := 0;
begin
select max(salary) into maximum from employee;
return maximum;
end;
/