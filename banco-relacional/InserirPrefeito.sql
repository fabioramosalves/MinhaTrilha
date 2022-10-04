select
    *
from
    cidades
insert into
    prefeitos (nome, cidade_id)
values
    ('Rodrigo Neves', 4),
    ('Raquel Lira', 2),
    ('Zenaldo Coutinho', null)



insert into
    prefeitos (nome, cidade_id)
values
    ('Rafael Greca', null)



select
    c.nome as 'cidade',
    p.nome as 'Prefeito'
from
    prefeitos p
    inner join cidades c on c.id = p.cidade_id