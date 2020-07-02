create table if not exists SIZES(
  ID serial primary key,
  NAME varchar(20) unique not null,
  PRICE integer not null
);
