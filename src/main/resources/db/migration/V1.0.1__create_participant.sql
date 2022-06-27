create table if not exists city
(
    id   uuid not null primary key,
    name varchar(255)
);
create table if not exists name_of_person
(
    id   uuid not null primary key,
    name varchar(255)
);
create table participant
(
    id      uuid    not null primary key,
    age     integer not null,
    city_id uuid,
    name_id uuid,
    constraint fk_participant_city foreign key (city_id) references city,
    constraint fk_participant_name foreign key (name_id) references name_of_person
);
