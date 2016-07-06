CREATE database xuetest
create table test(
  id int PRIMARY key AUTO_INCREMENT,
  username varchar(8) not null,
  phone varchar(20),
  salary double(10,2) not null,
  age int,
  sex int not null
)
drop table test
insert into test(username,phone,salary,age,sex) VALUES ('СѕЯўбр','563-92365',8067.89,43,1)
delete from test where salary between 5000 and 8000 
update test set username='ЕЫЯўЛЊ' where id=1  
SELECT * from test where sex=1 and age BETWEEN 20 and 30
select * from test where id=3
select username ,age from test order by age asc
select username ,age from test where sex=1 order by age desc
select MAX(age) from test where sex=1
select count(*),sex from test GROUP by sex

select SUM(salary),avg(salary) sex from test 
select count(*),max(age) sex from test group by sex 