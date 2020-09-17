-- create database petshop;
-- use petshop;

-- create table tb_animal(
-- id bigint auto_increment,
-- nome varchar(50),
-- raça varchar (50),
-- cor varchar (50),
-- peso decimal (5,3),
-- nome_dono varchar (50),
-- tel bigint(10),
-- primary key(id)
-- );

-- select *from tb_animal;

-- insert into tb_animal (nome, raça, cor, nome_dono, tel) values ("joana","srd","preta", 5.300, 11999214314);
-- insert into tb_animal (nome, raça, cor, nome_dono, tel) values ("jade","srd","preta", 3.500, 11999214314);
-- insert into tb_animal (nome, raça, cor, nome_dono, tel) values ("bolina","srd","preta e branca", 6.700, 11999214314);
-- insert into tb_animal (nome,raça,cor,nome_dono, tel) values ("bibi","srd","preta e branca", 4.500, 11999214317);
-- insert into tb_animal (nome,raça,cor,nome_dono, tel) values ("cuscuz","srd","amarela", 3.2, 11999214317);
-- insert into tb_animal (nome,raça,cor,nome_dono, tel) values ("zoião","srd","preta, laranja, marrom", 3.000, 11999214317);
-- insert into tb_animal (nome,raça,cor,nome_dono, tel) values ("xolo","srd","amarelo", 50.700, 11999214317);
-- insert into tb_animal (nome,raça,cor,nome_dono, tel) values ("cara de fuinha","srd","preta e marrom", 50.500, 11999214317);

-- select * from tb_animal;

-- select * from tb_animal where peso < 10; 

-- update tb_animal set  nome_dono = "Jessica" where id = 1;
-- update tb_animal set  nome_dono= "Jessica" where id = 2;
-- update tb_animal set  nome_dono = "Jessica" where id = 3;
-- update tb_animal set  nome_dono = "Jessica" where id = 4;
-- update tb_animal set  nome_dono = "Jessica" where id = 5;
-- update tb_animal set  nome_dono = "Jessica" where id = 6;
-- update tb_animal set  nome_dono = "Jessica" where id = 7;
-- update tb_animal set  nome_dono = "Jessica" where id = 8;

-- update tb_animal set  peso = 5.300 where id = 1;
-- update tb_animal set  peso = 3.500 where id = 2;
-- update tb_animal set  peso = 6.700 where id = 3;
-- update tb_animal set  peso = 4.500 where id = 4;
-- update tb_animal set  peso = 3.200 where id = 5;
-- update tb_animal set  peso = 3.000 where id = 6;
-- update tb_animal set  peso = 50.700 where id = 7;
-- update tb_animal set  peso = 50.500 where id = 8;

-- select * from tb_animal;

-- select * from tb_animal where peso < 10; 
 
--  select * from tb_animal where peso > 10;

-- select * from tb_animal where peso between 10.000 and 30.000; 

-- select * from tb_animal;

-- select * from tb_animal where peso between 10.000 and 60.000; 