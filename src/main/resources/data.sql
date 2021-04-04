insert into Usuario (id, nome) values (1,'Luís Ourique Garrau');
insert into Usuario (id, nome) values (2,'Ava Paião Arantes');
insert into Usuario (id, nome) values (3,'Amélia Belo Andrade');
insert into Usuario (id, nome) values (4,'Andrei Rua Passarinho');

insert into Focus (id,data_hora_inicio,data_hora_fim,id_usuario) values (1,'2021-04-04 12:00:00','2021-04-04 14:00:00',1);
insert into Focus (id,data_hora_inicio,data_hora_fim,id_usuario) values (2,'2021-04-04 15:00:00','2021-04-04 15:30:00',1);
insert into Focus (id,data_hora_inicio,data_hora_fim,id_usuario) values (3,'2021-04-04 18:00:00','2021-04-04 19:20:00',1);

insert into Focus (id,data_hora_inicio,data_hora_fim,id_usuario) values (4,'2021-04-03 09:00:00','2021-04-03 13:10:00',2);
insert into Focus (id,data_hora_inicio,data_hora_fim,id_usuario) values (5,'2021-04-04 11:00:00','2021-04-04 16:50:00',2);

insert into Focus (id,data_hora_inicio,data_hora_fim,id_usuario) values (6,'2021-04-03 22:10:00','2021-04-04 01:25:00',3);

insert into Concentra_Coin (id,quantidade,id_usuario,id_focus) values (1,20,1,1);
insert into Concentra_Coin (id,quantidade,id_usuario,id_focus) values (2,5,1,2);
insert into Concentra_Coin (id,quantidade,id_usuario,id_focus) values (3,14,1,3);

insert into Concentra_Coin (id,quantidade,id_usuario,id_focus) values (4,42,2,4);
insert into Concentra_Coin (id,quantidade,id_usuario,id_focus) values (5,59,2,5);

insert into Concentra_Coin (id,quantidade,id_usuario,id_focus) values (6,33,3,6);