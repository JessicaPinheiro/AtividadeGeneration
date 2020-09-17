-- create database db_farmacia_do_bem;

-- use db_farmacia_do_bem;

-- create table tb_categoria(
-- id bigint auto_increment,
-- tipo varchar (50),
-- marca varchar (50),
-- disp boolean not null,
-- primary key (id)
-- );

-- select * from tb_categoria;

-- insert into tb_categoria (tipo, marca,disp) value ("medicamento", "generico", true);
-- insert into tb_categoria (tipo, marca,disp) value ("medicamento", "generico", false);
-- insert into tb_categoria (tipo, marca,disp) value ("medicamento", "EMS Corp", true);
-- insert into tb_categoria (tipo, marca,disp) value ("medicamento", "EMS Corp", false);
-- insert into tb_categoria (tipo, marca,disp) value ("beleza", "mary key", true);
-- insert into tb_categoria (tipo, marca,disp) value ("beleza", "mary key", false);
-- insert into tb_categoria (tipo, marca,disp) value ("higiene", "dove", true);
-- insert into tb_categoria (tipo, marca,disp) value ("higiene", "dove", false);

-- create table tb_produto (
-- id  bigint (10) auto_increment,
-- loc_farm varchar (50)not null,
-- produto varchar(50)not null,
-- tipo_id bigint(50),
-- categotia_id varchar (10)not null,
-- valor bigint(10)not null,

-- primary key (id),
-- foreign key (tipo_id) references tb_categoria (id)
-- );

-- select * from tb_produto

-- ALTER TABLE tb_produto DROP COLUMN categotia_id;

-- insert into tb_produto (loc_farm,produto,tipo_id, valor) values ("moema","unitram", 3, 150);
-- insert into tb_produto (loc_farm,produto,tipo_id, valor) values ("moema","unitram", 2, 100);
-- insert into tb_produto (loc_farm,produto,tipo_id, valor) values ("jabaquara","propanalo", 3, 7);
-- insert into tb_produto (loc_farm,produto,tipo_id, valor) values ("jabaquara","batom", 5, 170);
-- insert into tb_produto (loc_farm,produto,tipo_id, valor) values ("planalto","sabonete", 7, 6);
-- insert into tb_produto (loc_farm,produto,tipo_id, valor) values ("campo belo","ante transpirante", 7, 100);
-- insert into tb_produto (loc_farm,produto,tipo_id, valor) values ("vila mariana","unitram", 1, 40);
-- insert into tb_produto (loc_farm,produto,tipo_id, valor) values ("itaquera","perfume", 5, 500);

-- select * from tb_produto

-- select * from tb_produto where valor > 50

-- select *from tb_produto where valor between 3 and 60

-- select * from tb_produto where produto like "%b%"

-- select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.tipo_id

-- select produto, tipo, marca, valor from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.tipo_id