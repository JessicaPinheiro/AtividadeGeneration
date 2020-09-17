-- create database db_pizzaria_legal;

-- use db_pizzaria_legal;

-- create table  tb_categoria (
-- id bigint auto_increment,
-- tamanho varchar (50) not null,
-- pedacos varchar (50) not null,

-- primary key (id)
-- );

-- insert into tb_categoria (tamanho, pedacos) values ("familia","12");
-- insert into tb_categoria (tamanho, pedacos) values ("grande","8");
-- insert into tb_categoria (tamanho, pedacos) values ("media","6");
-- insert into tb_categoria (tamanho, pedacos) values ("pequena","4");
-- insert into tb_categoria (tamanho, pedacos) values ("min","2");

-- select * from tb_categoria;

 -- create table tb_pizza(
 
 -- id bigint auto_increment,
 -- sabor varchar(50) not null,
 -- tamanho_id bigint not null,
 -- pedacos_id varchar (50)not null,
 -- valor decimal(10,2)not null,
 
 -- primary key (id),
--  foreign key (tamanho_id) references tb_categoria (id)
-- ); 

 
-- select * from  tb_pizza;
 
-- insert into tb_pizza (sabor, tamanho_id, pedacos_id,valor) values ("mussarela", "1", "1", 79.99);
-- insert into tb_pizza (sabor, tamanho_id, pedacos_id,valor) values ("mussarela", "2", "2", 69.99);
-- insert into tb_pizza (sabor, tamanho_id, pedacos_id,valor) values ("mussarela", "3", "3", 59.99);
-- insert into tb_pizza (sabor, tamanho_id, pedacos_id,valor) values ("mussarela", "4", "4", 49.99);
-- insert into tb_pizza (sabor, tamanho_id, pedacos_id,valor) values ("mussarela", "5", "5", 19.99);
-- insert into tb_pizza (sabor, tamanho_id, pedacos_id,valor) values ("calabresa", "1", "1", 79.99);
-- insert into tb_pizza (sabor, tamanho_id, pedacos_id,valor) values ("calabresa", "2", "2", 69.99);
-- insert into tb_pizza (sabor, tamanho_id, pedacos_id,valor) values ("calabresa", "3", "3", 59.99);
-- insert into tb_pizza (sabor, tamanho_id, pedacos_id,valor) values ("calabresa", "4", "4", 49.99);
-- insert into tb_pizza (sabor, tamanho_id, pedacos_id,valor) values ("calabresa", "5", "5", 19.99);

-- select * from tb_pizza where valor > 45;

-- select * from tb_pizza where valor between 29 and 60;

-- select * from tb_pizza where sabor like '%c%';

-- select sabor,tamanho,pedacos,valor from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.pedacos_id;




