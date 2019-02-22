create table in_member(
    Mno int not null primary key auto_increment,
	id varchar(20) not null,
    email varchar(30) not null,
    pw varchar(20) not null

);

insert into in_member(id,email,pw)
values("admin","dldls1383@gmail.com",1383);

insert into in_member(id,email,pw)
values("user1","chaosmos1383@gmail.com",1234);