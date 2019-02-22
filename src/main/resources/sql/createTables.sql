create table nation(
	Nno int not null primary key auto_increment,
    name varchar(20) not null
 );
 
 create table meal(
	Nno int not null,
    Mmo int not null primary key auto_increment,
    onep int not null,
    twop int not null,
    mcmill int not null
    
);

create table market(
	Nno int not null,
    Mmo int not null primary key auto_increment,
    milk int not null,
    rice int not null,
    apple int not null,
    water int not null
    
);

create table child(
	Nno int not null,
    Cno int not null primary key auto_increment,
    kinder int not null, 
    school int not null
);

create table living(
	Nno int not null,
    Lno int not null primary key auto_increment,
    cityOne int not null,
    cityTwo int not null,
    subOne int not null,
    subTwo int not null
    
);

create table in_board(

bno INT NOT NULL AUTO_INCREMENT,

title VARCHAR(200) NOT NULL,

content VARCHAR(2000) NOT NULL,

writer VARCHAR(200) NOT NULL,

regdate TIMESTAMP NOT NULL default NOW(),

viewcnt INT DEFAULT 0,

PRIMARY KEY(bno));

create table in_reply (

rno int not null auto_increment,

bno int not null default 0,

replytext varchar(1000) not null,

replyer varchar(50) not null,

regdate TIMESTAMP NOT NULL DEFAULT now(),

updatedate timestamp NOT NULL DEFAULT now(),

primary key(rno)

);

create table in_member(
    Mno int not null primary key auto_increment,
	id varchar(20) not null,
    email varchar(30) not null,
    pw varchar(20) not null

);


 
 