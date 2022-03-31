create table TEST01( no int(4), name varchar(10),
						hdate DATETIME DEFAULT CURRENT_TIMESTAMP);
select * from Test01;

insert into TEST01 values(1111,'홍길동','2009-12-12');
insert into TEST01 values(2222,'이길동','2010-12-12');
insert into TEST01 values(3333,'정길동','2011-12-12');
insert into TEST01 values(4444,'최길동','2012-12-12');