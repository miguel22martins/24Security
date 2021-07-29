create database Security24;
use Security24;

create table Planos(
	PlanosID int not null,
    primary key (PlanosID),
    Nome varchar (60),
	Duracao varchar(120) not null,
    Descricao varchar (300),
    preco double not null
);

create table Administradores(
	AdministradorID int not null,
    primary key (AdministradorID),
    Nome varchar(60) not null,
    Email varchar(120) not null,
    NomeAdministrador varchar(60) not null,
    PalavraChave varchar(60) not null,
	DataNascimento date not null
);



create table Utilizadores(
	UtilizadorID int not null,
    primary key (UtilizadorID),
    Nome varchar(60) not null,
    Email varchar(120) not null,
    NomeUtilizador varchar(60) not null,
    PalavraChave varchar(60) not null,
    DataNascimento date not null,
    NIF int not null,
    PlanosID int not null);
    /*CONSTRAINT FK_PlanosID FOREIGN KEY (IDPlanos) REFERENCES Planos(PlanosID)*/

select * from Planos;
select * from Utilizadores;
select * from Administradores;


INSERT INTO Planos VALUES 
(1, "24Security Low-Cost", "Contrato mínimo de 6 meses com possibilidade de renovação", "No plano Low-Cost dispomos de um alarme caseiro com sensores de movimento. Se ativado, irá ser reencaminhado um carro da 24Security para avriguar a situação.", 50.99),
(2, "24Security Medium-Cost", "Contrato mínimo de 6 meses com possibilidade de renovação", "O  plano Medium-price garante 2 camêras de vigilância com vigilância por parte da nossa equipa durante 6 h por dia.", 125.50),
(3, "24Security Premium", "Contrato mínimo de 6 meses com possibilidade de renovação", "O plano Premium, garante 4 camêras de vigilância com vigilância 24/7 por parte da nossa equipa. Incluí também alarme caseiro, com sensores de movimento.", 220.99),
(4, "24Security Best-Offer", "Contrato mínimo de 12 meses com possibilidade de renovação", "O plano-Oferta, garante 2 camêras de vigilância com registos por vídeo caso haja algum ocorrido. Incluí também alarme caseiro, com sensores de movimento.", 115.50);



INSERT INTO Utilizadores VALUES
 (1, "João", "joaofrancisco@gmail.com","Joao1998","JF_24Security","1998/12/31", 145678910, 3),
 (2, "Ricardo", "Ricardo@gmail.com","Joao1998","JF_24Security","1998/12/31", 145678910, 2),
 (3, "Manel", "Manel@gmail.com","Joao1998","JF_24Security","1998/12/31", 145678910, 4),
 (4, "Maria", "mariajoana21@gmail.com","Maria1979", "MJ20_","1979/10/05", 117539512, 2),
 (5, "Paulo", "pauloluis30@gmail.com", "Paulo1981","PLuis30","1981/03/14", 465897103, 1),
 (6, "Carla", "carlatomas_pessoal@gmail.com","Carla1972", "#CT24#","1972/01/12", 213054689, 4);
 
 INSERT INTO Administradores VALUES
 (1,"David", "david_24_admin@gmail.com","David_Admin","D_Admin1","1974/09/06");
