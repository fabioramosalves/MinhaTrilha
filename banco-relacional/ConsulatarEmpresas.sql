select e.nome 'empresa' , c.nome 'cidade' from
empresas e, empresas_unidades eu, cidades c 
where 
e.id = eu.empresa_id
and 
c.id = eu.cidade_id
and sede