insert into cidades (nome, area, estado_id)
values ('Campinas', 795,25)


insert into cidades (nome, area, estado_id)
values ('Niterói', 133.9, 24)

insert into cidades (nome, area, estado_id)
select 'Caruaru', 920.6, id from estados where sigla = 'PE'

update cidades set estado_id = 30 where id = 1

insert into cidades
(nome, area, estado_id)
values
('Juazeiro do Norte',
248.2,(select id from estados where sigla = 'CE'))


select c.id ,e.sigla, c.nome, e.populacao from cidades c inner join estados e on
e.id = c.estado_id