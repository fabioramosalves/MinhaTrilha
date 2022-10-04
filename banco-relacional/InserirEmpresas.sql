insert into empresas
(nome, cnpj)
values
('Bradesco', '65465465465466'),
('Vale', '65498798798799'),
('Cielo', '03216549879879')

select * from empresas
--alter table empresas modify cnpj varchar(14)

select * from empresas
select * from cidades
select * from empresas_unidades

insert into empresas_unidades
    (empresa_id,cidade_id,sede)
values
    (1,1,1),
    (1,2,0),
    (2,1,0),
    (2,2,1)

select * from empresas_unidades
