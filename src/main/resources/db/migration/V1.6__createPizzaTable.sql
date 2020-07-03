create table if not exists PIZZAS (
        ID serial primary key,
        SIZE_ID integer references SIZES(ID) ON DELETE CASCADE,
        ORDER_ID integer references ORDERS (ID) ON DELETE CASCADE
);
