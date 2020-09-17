-- create database db_generation_game_online;

-- use db_generation_game_online;

-- create table tb_classe(
-- id bigint auto_increment,
-- tipo varchar(50),
-- poder varchar (50), 
-- primary key (id)
-- );

-- insert into tb_classe (tipo,poder) values ("bombeiro","apagar fogo");
-- insert into tb_classe (tipo,poder) values ("policia","prender");
-- insert into tb_classe (tipo,poder) values ("medico","curar");
-- insert into tb_classe (tipo,poder) values ("professor","ajudar");
-- insert into tb_classe (tipo,poder) values ("mae","cuidar");

-- create table  tb_personagem(
-- id bigint auto_increment,
-- personagem varchar (50)not null,
-- ataque bigint (50)not null,
-- defesa bigint (10)not null,
-- xp bigint (10) not null,
-- xp_adc bigint (10) not null,
-- tipo_id bigint  not null,

-- primary key (id),
-- foreign key (tipo_id) references tb_classe(id)
-- );

-- select * from tb_personagem

-- insert into tb_personagem (personagem,ataque,defesa,xp,xp_adc,tipo_id) values ("avatar", 386, 784,150,50,1);
-- insert into tb_personagem (personagem,ataque,defesa,xp,xp_adc,tipo_id) values ("rodrigues", 999, 111,150,999,2);
-- insert into tb_personagem (personagem,ataque,defesa,xp,xp_adc,tipo_id) values ("lay", 990, 758,780,452,3);
-- insert into tb_personagem (personagem,ataque,defesa,xp,xp_adc,tipo_id) values ("camila", 999, 999,999,7,4);
-- insert into tb_personagem (personagem,ataque,defesa,xp,xp_adc,tipo_id) values ("mario", 411, 014, 874,44,5);
-- insert into tb_personagem (personagem,ataque,defesa,xp,xp_adc,tipo_id) values ("fraça", 0, 1,999,547,1);
-- insert into tb_personagem (personagem,ataque,defesa,xp,xp_adc,tipo_id) values ("jessica", 999, 999, 2,1,3);
-- insert into tb_personagem (personagem,ataque,defesa,xp,xp_adc,tipo_id) values ("avatar", 386, 784,150,875,4);

-- select * from tb_personagem where ataque > 200 -- coloquei 200 para mostra algum valor pois 2000 ñ tem. 

-- select * from tb_personagem where defesa between 100 and 200; -- coloquei 100 e 200 para poder exibir as info.

-- select * from tb_personagem where personagem like "%c%"

-- select personagem, ataque, defesa, tipo, poder from tb_personagem inner join tb_classe on tb_classe.id = tb_personagem.id; -- botei nessa ordem de apresentação para ficar mais bonito 

-- select * from tb_personagem where tipo_id like "%1%"

