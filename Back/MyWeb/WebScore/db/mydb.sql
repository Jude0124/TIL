 create table Score(
   name varchar(20) primary key,
   kor int(5),
   eng int(5),
   mat int(5),
   tot int(5),
   s_avg int(5),
   grade  varchar(5)
 );
 
 insert into Score(name,kor,eng,mat) values('AAA',80,78,67);
 insert into Score(name,kor,eng,mat) values('BBB',70,73,57);
 insert into Score(name,kor,eng,mat) values('CCC',60,98,97);
 insert into Score(name,kor,eng,mat) values('DDD',50,68,87);
 
 select * from SCORE;
 
 