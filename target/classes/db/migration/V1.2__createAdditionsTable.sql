create table if not exists ADDITIONS(
  ID serial primary key,
  NAME varchar(20) unique not null,
  PRICE integer not null
);
