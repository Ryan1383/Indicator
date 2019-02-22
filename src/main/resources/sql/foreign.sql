alter table meal add constraint fk_nation1 foreign key(Nno) references nation(Nno);
alter table market add constraint fk_nation2 foreign key(Nno) references nation(Nno);
alter table child add constraint fk_nation3 foreign key(Nno) references nation(Nno);
alter table living add constraint fk_nation4 foreign key(Nno) references nation(Nno);
alter table in_reply add constraint fk_board foreign key (bno) references in_board (bno);