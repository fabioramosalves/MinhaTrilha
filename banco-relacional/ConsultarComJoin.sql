select
    c.nome as cidade,
    e.nome as estado,
    e.regiao as regiao
from
    estados e, cidades c 
where e.id = c.estado_id



select 
 c.nome as cidade,
 e.nome as estados,
 regiao as regiao
 from estados e 
 inner join cidades c on c.estado_id = e.id
