drop table if exists pokemon;

create table if not exists pokemon(

    id serial primary key,
    name varchar(255) not null,
    type varchar(25) not null,
    image varchar(1000),
    evolution_id int,

    check(type in ('FIRE', 'WATER', 'ELECTRIC'))
);

insert into pokemon(name, type, evolution_id, image) values ('Pichu', 'ELECTRIC', 2, 'https://assets.pokemon.com/assets/cms2/img/pokedex/full/172.png');
insert into pokemon(name, type, evolution_id, image) values ('Pikachu', 'ELECTRIC', 3, 'https://assets.pokemon.com/assets/cms2/img/pokedex/full/025.png');
insert into pokemon(name, type, image) values ('Raichu', 'ELECTRIC', 'https://assets.pokemon.com/assets/cms2/img/pokedex/full/026.png');