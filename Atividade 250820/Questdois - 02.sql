use e_commerce;
create table tb_prod(
id bigint auto_increment,
produto varchar (30) not null,
departamento varchar (30) not null, 
tam_idade int (3) not null, -- numero da equipe pertecente 
valor decimal (10,2) not null,

primary key (id)

);