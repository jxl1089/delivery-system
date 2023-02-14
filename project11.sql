CREATE TABLE member(

id varchar2(30) primary key not null ,

pw varchar2(30) not null,

name varchar2(30) not null,

email varchar2(50) not null,

age int not null,

gender varchar2(30) not null,

phoneNum varchar2(30) not null
);

select * from member;

drop table member;

drop table quest;

create table quest(

    quest_id varchar2(20) primary key not null,
    user_id varchar2(30) not null,
    constraint fk_id foreign key (user_id) references member(id),
    quest_detail varchar(200) not null,
    price integer

);

create table wallet(
    wallet_id varchar2(30) not null,
    constraint walletfk_id foreign key (wallet_id) references member(id),
    money integer
);

insert into quest values ('2','4', '도시락 배달' ,25000);

select * from quest;

--출력하는 법
select quest_id, name, quest_detail, price from member m, quest q where m.id = q.user_id;

delete from quest where quest_id = 2;
