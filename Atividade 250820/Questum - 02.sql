use rh;
create table tb_funci(
id bigint(3) auto_increment,
nome varchar (30) not null,
departamento varchar (30) not null, 
salario decimal (10,2) not null,
n_equipe int (3) not null, -- numero da equipe pertecente 

primary key (id)

);