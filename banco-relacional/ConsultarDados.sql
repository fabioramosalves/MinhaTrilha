

select sigla, nome from  estados where regiao = 'sul';

select sigla, nome, populacao from  estados where populacao >= 10
order by populacao desc;