insert into
    estados (nome, sigla, regiao, populacao)
values
    ('Acre', 'AC', 'Norte', 0.83),

insert into
    estados (nome, sigla, regiao, populacao)
values
    ('Alagoas', 'AL', 'Nordeste', 3.38),
    ('Amapá', 'AP', 'Norte', 0.8),
    ('Amazonas', 'AM', 'Norte', 4.06)



select sigla, nome, populacao from  estados where populacao >= 10
order by populacao desc


