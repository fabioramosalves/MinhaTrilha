
insert into estados (id, nome, sigla, regiao, populacao)
values 
(44,"Mais mais Novo", 'MM', 'sul', 2.54)
(1000,"Mais Novo", 'MN', 'sul', 2.54)

insert into estados (nome, sigla, regiao, populacao)
values 
("Mais Novo", 'MN', 'sul', 2.51)


select  * from estados
order by id desc


Delete from estados where sigla in ('MN','MM', 'NV');


Delete frinestados where sigla = 'MM', 'NV');