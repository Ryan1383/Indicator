create table in_board(

bno INT NOT NULL AUTO_INCREMENT,

title VARCHAR(200) NOT NULL,

content VARCHAR(2000) NOT NULL,

writer VARCHAR(200) NOT NULL,

regdate TIMESTAMP NOT NULL default NOW(),

viewcnt INT DEFAULT 0,

PRIMARY KEY(bno));