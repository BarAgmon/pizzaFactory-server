create table if not exists STATES(
  ID serial primary key,
  NAME varchar(20) unique not null
);
