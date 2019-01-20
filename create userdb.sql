-- Create table
create table USERDB
(
  userid   NUMBER not null,
  uname    VARCHAR2(20),
  password VARCHAR2(20),
  brithday VARCHAR2(20),
  pro      NUMBER,
  isdelete NUMBER
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
-- Add comments to the columns 
comment on column USERDB.pro
  is '0&1';
comment on column USERDB.isdelete
  is '0&1';
-- Create/Recreate primary, unique and foreign key constraints 
alter table USERDB
  add constraint USERID primary key (USERID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

commit;

select * from userdb for update;

insert into userdb values(10001,'Jreey','admin','2019/1/19',1,0);
insert into userdb values(10002,'Tom','123','2019/1/20',0,0);
insert into userdb values(10003,'Mark','123','2019/1/21',0,1);
select userid from userdb order by userid desc;
