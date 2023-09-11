create or replace procedure insertuser(id in number, name in varchar2,mark in number)
is 
begin
insert into student values(id,name,mark);
end;
/