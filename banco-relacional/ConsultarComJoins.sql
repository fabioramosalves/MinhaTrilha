use wm;

select * from prefeitos;
select * from cidades;

select * from cidades c inner join prefeitos p on c.id = p.cidade_id;
select * from cidades c left join prefeitos p on c.id = p.cidade_id;
select * from cidades c right join prefeitos p on c.id = p.cidade_id;

-- equivalante ao (full join)
select * from cidades c left join prefeitos p on c.id = p.cidade_id
union
select * from cidades c right join prefeitos p on c.id = p.cidade_id;

select * from prefeitos p left join cidades c on c.id = p.cidade_id;

select * from prefeitos p left outer join cidades c on c.id = p.cidade_id;