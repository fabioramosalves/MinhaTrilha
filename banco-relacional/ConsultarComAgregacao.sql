select
    regiao as 'Regiao',
    sum(populacao) as Total
from
    estados
GROUP BY
    regiao
order by 
    total desc


    select
    sum(populacao) as Total
from
    estados
order by 
    total desc


select
    avg(populacao) as Total
from
    estados
order by 
    total desc