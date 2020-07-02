create table if not exists ORDERS(
  ID serial primary key not null,
  COSTUMER_ID integer references COSTUMERS (ID) ON DELETE CASCADE,
  ORDER_TIME date not null,
  COMMENT varchar(100),
  STATE_ID integer references STATES (ID) ON DELETE CASCADE
);
