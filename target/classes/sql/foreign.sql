alter table in_reply add constraint fk_board

foreign key (bno) references in_board (bno);