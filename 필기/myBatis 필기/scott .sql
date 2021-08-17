-- 21.07.01
drop table login1;
create table login1(
    user_id varchar2(50),
    user_pw varchar2(50)
);

select * from login1;

-- 21.07.06
create table book(
    title varchar2(20),
    author varchar2(20),
    price varchar2(20)
);

select * from book;

-- 21.07.15
CREATE SEQUENCE id
       INCREMENT BY 1
       START WITH 1
       MINVALUE 1
       MAXVALUE 9999
       NOCYCLE
       NOCACHE
       NOORDER;
       
CREATE TABLE music(
  song_id NUMBER PRIMARY KEY, -- 기본키(시퀀스 적용할 컬럼)
  song_title varchar2(20),
  song_singer varchar2(50),
  song_genre varchar2(20),
  song_price varchar2(20),
  song_passwd varchar2(20),
  song_date varchar2(20)
);

select * from music;
select * from music where song_title = 'Next Level';
select * from music order by song_id desc;
select * from music where song_id= 1;