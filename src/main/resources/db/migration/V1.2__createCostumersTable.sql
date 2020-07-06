create table if not exists COSTUMERS(
  ID integer primary key not null,
  NAME varchar(20) not null,
  LAST_NAME varchar(20) not null,
  CITY varchar(20) not null,
  ADDRESS varchar(20) not null,
  USERNAME varchar(20) unique not null,
  PASSWORD varchar(20) not null 
);
