Create table if not exists cidades (
id int unsigned not null AUTO_INCREMENT,
nome varchar(255) not null,
estado_id int unsigned not null,
area decimal(10,2),
primary key (id),
foreign key (estado_id) references estados (id)
);

--apenas para verificar o comando drop table

Create table if not exists teste (
id int unsigned not null AUTO_INCREMENT,
nome varchar(255) not null,
estado_id int unsigned not null,
area decimal(10,2),
primary key (id)

);

drop table teste