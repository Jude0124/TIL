create table goodsinfo(
code varchar(10),
name varchar(30),
price int,
maker varchar(20));

insert into goodsinfo(code,name,price,maker) values('p0001','자바',25000,'G70');
insert into goodsinfo(code,name,price,maker) values('p0002','JSP',30000,'엔코아');
insert into goodsinfo(code,name,price,maker) values('p0003','spring',30000,'정보기술원');

select * from goodsinfo;
