create table if not exists PIZZA (
        ID serial primary key,
        ADDITION_ID integer references ADDITIONS (ID) ON DELETE CASCADE,
        SIZE_ID integer references SIZES(ID) ON DELETE CASCADE
);
