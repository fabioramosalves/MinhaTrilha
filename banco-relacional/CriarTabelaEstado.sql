use wm;

create table estados (
    id int UNSIGNED not null AUTO_INCREMENT,
    nome varchar(45) not null,
    sigla varchar(2) not null,
    regiao enum('Norte', 'Nordeste', 'Centro-Oeste', 'Sudeste', 'Sul') not null,
    populacao decimal(5,2) not null,
    primary key (id),
    unique key (nome),
    unique key (sigla)
);


