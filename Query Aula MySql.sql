select *from itau.usuarios;

update itau.usuarios set endereco_cliente="Atualizar Endereço" where endereco_cliente ="";

update itau.usuarios set endereco_cliente="Av. Pompéia" where codigo_cliente =1;
update itau.usuarios set endereco_cliente="Rua Tito" where idade_cliente>=99;

select *from itau.usuarios where idade_cliente >=99;

create table itau.bck_usuarios (select * from itau.usuarios);

select * from itau.bck_usuarios;

select count(*) from itau.usuarios;
select count(*) from itau.bck_usuarios;

delete from itau.usuarios;

insert into itau.usuarios (
nome_cliente, idade_cliente, email_cliente, endereco_cliente)
select nome_cliente, idade_cliente, email_cliente, endereco_cliente from itau.bck_usuarios;

rename table itau.usuarios to itau.clientes;
rename table itau.bck_usuarios to itau.bck_clientes;

drop table itau.clientes;

create table itau.clientes select * from itau.bck_clientes;

describe itau.clientes;

alter table itau.clientes change codigo_cliente codigo_cliente int(6) not null auto_increment primary key; 

select count(*) from itau.clientes;
select count(*) from itau.bck_clientes;

create database unibanco;
create table unibanco.bck_clientes (select * from itau.bck_clientes); 

drop table itau.clientes;

create table itau.clientes(
codigo_cliente int(6) not null auto_increment,
nome_cliente varchar(60) not null,
endereco_cliente varchar(80) not null,
bairro_cliente varchar(30) not null,
idade_cliente int(3) not null,
email_cliente varchar(80) not null,
cpf_cliente varchar(14) not null,
telefone_cliente varchar(14) not null,
primary key (codigo_cliente, cpf_cliente));

alter table itau.clientes add data_motificacao_cliente datetime;
alter table itau.clientes rename column data_motificacao_cliente to  data_modificacao_cliente;



describe itau.clientes;

insert into itau.clientes
(nome_cliente,endereco_cliente,bairro_cliente,idade_cliente,email_cliente,cpf_cliente,telefone_cliente,data_modificacao_cliente)
select nome_cliente,endereco_cliente,"",idade_cliente,email_cliente,"","",now() from unibanco.bck_clientes;


update itau.clientes set bairro_cliente="Atualizar Bairro", cpf_cliente="000.000.000-00", telefone_cliente="(00)00000-0000"
where bairro_cliente="" and cpf_cliente="" and telefone_cliente="";

select * from itau.clientes;

create table itau.produtos (
codigo_produto int(6) not null auto_increment primary key,
nome_produto varchar(50) not null,
quantidade_produto int(6) not null,
preco_unitario decimal(8,2) not null,
cod_marca_produto int(6) not null,
data_validade date,
data_modificacao_produto datetime,
nome_usuario_cadastrado varchar(50) not null);


insert into itau.produtos
(nome_produto,quantidade_produto,preco_unitario,cod_marca_produto,data_validade,data_modificacao_produto,nome_usuario_cadastrado)
values
("Microondas",100,375.99,1,now(),now(),"Ricardo Alexandre"),
("Microsystem",70,500.00,1,now(),now(),"Ricardo Alexandre"),
("Batedeira",150,250.80,2,now(),now(),"Ricardo Alexandre"),
("Liquidificador",100,375.99,2,now(),now(),"Ricardo Alexandre"),
("Geladeira",700,1890.50,3,now(),now(),"Ricardo Alexandre"),
("Fogão",350,650.99,3,now(),now(),"Ricardo Alexandre"),
("TV 32 polegadas",50,789.99,1,now(),now(),"Ricardo Alexandre");



select nome_produto, quantidade_produto, preco_unitario, (quantidade_produto * preco_unitario) as Total from itau.produtos;
select sum(quantidade_produto * preco_unitario) from itau.produtos;
 
select * from itau.clientes where nome_cliente like "Ana%";

create table itau.marca_produtos(
cod_marca int(6) not null auto_increment,
nome_marca varchar(50) not null,
primary key (cod_marca));

insert into itau.marca_produtos
(nome_marca) value 
("LG"),
("Walita"),
("Eletrolux"),
("Brastemp"); 

select p.nome_produto, p.quantidade_produto, p.preco_unitario, p.data_validade, m.nome_marca 
from 	itau.produtos as p,
		itau.marca_produtos as m
where (p.cod_marca_produto=m.cod_marca);

create table itau.cargo(
cod_cargo char(2) not null primary key,
nome_cargo varchar(50) not null,
valor_cargo decimal(8,2) not null);

insert into itau.cargo(
cod_cargo, nome_cargo, valor_cargo) 
values
("C1","Caixa",800.00),
("C2","Vendedor",1800.00),
("C3","Administrador de TI",8000.00),
("C4","administrador de BD",9500.00);


create table itau.funcionarios(
matricula_funcionario int(6) not null auto_increment,
nome_funcionario varchar(50) not null,
cod_cargo_funcionario char(2) not null,
primary key (matricula_funcionario),
foreign key (cod_cargo_funcionario) references itau.cargo(cod_cargo)
);

insert into itau.funcionarios (nome_funcionario, cod_cargo_funcionario)
values
("Pedro","C3"),
("Bruno","C2"),
("Ana Carolina","C4"),
("Igor","C1");

select *from itau.cargo;

delete from itau.cargo where cod_cargo="C1";

select f.matricula_funcionario,f.nome_funcionario,c.nome_cargo,c.valor_cargo
from itau.funcionarios as f
right join itau.cargo as c
on(f.cod_cargo_funcionario=c.cod_cargo);

 

select f.matricula_funcionario,f.nome_funcionario,c.nome_cargo,c.valor_cargo
from itau.funcionarios as f
inner join itau.cargo as c
on(f.cod_cargo_funcionario=c.cod_cargo);

 

select f.matricula_funcionario,f.nome_funcionario,c.nome_cargo,c.valor_cargo
from itau.cargo as c
left join itau.funcionarios as f
on(f.cod_cargo_funcionario=c.cod_cargo);

select
p.cod_marca_produto,p.nome_produto,p.quantidade_produto,p.preco_unitario,(p.quantidade_produto*p.preco_unitario) as  total ,
m.nome_marca,f.nome_funcionario,m.cod_marca,f.matricula_funcionario
from
itau.produtos as p,
itau.marca_produtos as m,
itau.funcionarios as f
where
p.cod_marca_produto=m.cod_marca and
p.matricula=f.matricula_funcionario order by p.nome_produto;



create database backups;
-- Exclui as tabelas de Backup
drop table backups.bck_cargo;
drop table backups.bck_clientes;
drop table backups.bck_funcionarios;
drop table backups.bck_marcas_produtos;
drop table backups.bck_produtos;
-- Atualiza as tabelas de Backup
create table backups.bck_cargo (select * from itau.cargo);
create table backups.bck_clientes (select * from itau.clientes);
create table backups.bck_funcionarios (select * from itau.funcionarios);
create table backups.bck_marcas_produtos (select * from itau.marca_produtos);
create table backups.bck_produtos (select * from itau.produtos);

