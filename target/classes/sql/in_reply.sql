create table in_reply (

rno int not null auto_increment,

bno int not null default 0,

replytext varchar(1000) not null,

replyer varchar(50) not null,

regdate TIMESTAMP NOT NULL DEFAULT now(),

updatedate timestamp NOT NULL DEFAULT now(),

primary key(rno)

);