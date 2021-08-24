-- 21.08.24
create table member(
userid varchar2(20) primary key,
passwd varchar2(50),
name varchar2(50),
email varchar2(50),
join_date date default sysdate
);

insert into member(userid, passwd, name, email) values('kim','1111','±è¾Æ´Ï','kim@gmail.com');
select * from member;