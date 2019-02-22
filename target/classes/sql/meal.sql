create table meal(
	Nno int not null,
    Mmo int not null primary key auto_increment,
    onep int not null,
    twop int not null,
    mcmill int not null
    
);
alter table meal add constraint fk_nation

foreign key (Nno) references nation (Nno);

insert into meal (Nno,onep,twop,mcmill)
values(1,3000,7000,1000);
insert into meal (Nno,onep,twop,mcmill)
values(1,2000,5000,1000);
insert into meal (Nno,onep,twop,mcmill)
values(2,6000,10000,1000);
insert into meal (Nno,onep,twop,mcmill)
values(2,2000,5000,1000);
insert into meal (Nno,onep,twop,mcmill)
values(3,6000,2000,1000);
insert into meal (Nno,onep,twop,mcmill)
values(3,4000,2700,1800);
insert into meal (Nno,onep,twop,mcmill)
values(4,5000,2200,1500);
insert into meal (Nno,onep,twop,mcmill)
values(4,2000,3000,8000);
insert into meal (Nno,onep,twop,mcmill)
values(5,5000,2000,2000);
insert into meal (Nno,onep,twop,mcmill)
values(6,7000,2300,1500);
insert into meal (Nno,onep,twop,mcmill)
values(7,8000,2800,1600);
insert into meal (Nno,onep,twop,mcmill)
values(7,3000,5600,1800);

