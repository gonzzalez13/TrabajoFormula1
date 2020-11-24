DROP DATABASE F1;
CREATE SCHEMA IF NOT EXISTS `F1` DEFAULT CHARACTER SET utf8 ;
USE `F1` ;

-- -----------------------------------------------------
-- Table escuderia
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS escuderia (
  id_escuderia INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  color VARCHAR(45) NOT NULL,
  nacionalidad VARCHAR(45) NOT NULL,
  palmares INT NOT NULL,
  sede VARCHAR(45) NOT NULL,
  jefe_equipo VARCHAR(45) NOT NULL,
  jefe_tecnico VARCHAR(45) NOT NULL,
  estrenada_f1 YEAR NOT NULL,
constraint pk_id_escuderia  PRIMARY KEY (id_escuderia));



-- -----------------------------------------------------
-- Table piloto
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS piloto (
  id_piloto INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  nacionalidad VARCHAR(45) NOT NULL,
  fecha_nacimiento DATE NOT NULL,
  palmares VARCHAR(45) NOT NULL,
  estado VARCHAR(45) NOT NULL,
  bibliografia TEXT NOT NULL,
  podios INT NOT NULL,
  escuderia_id_escuderia INT NOT NULL,
 CONSTRAINT pk_id_piloto PRIMARY KEY (id_piloto),
  CONSTRAINT fk_piloto_escuderia1 FOREIGN KEY (escuderia_id_escuderia) REFERENCES escuderia (id_escuderia));
  


-- -----------------------------------------------------
-- Table coche
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS coche (
  id_coche INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  motor VARCHAR(45) NOT NULL,
  v_punta DECIMAL(2) NOT NULL,
  i_aerodinamico DECIMAL(2) NOT NULL,
  cv DECIMAL(2) NOT NULL,
  frenada DECIMAL(2) NOT NULL,
  escuderia_id_escuderia INT NOT NULL,
  piloto_id_piloto INT NOT NULL,
  PRIMARY KEY (id_coche),
  
  CONSTRAINT fk_coche_escuderia FOREIGN KEY  (escuderia_id_escuderia) REFERENCES escuderia (id_escuderia),
  CONSTRAINT fk_coche_piloto1 FOREIGN KEY  (piloto_id_piloto) REFERENCES piloto (id_piloto));
 



-- -----------------------------------------------------
-- Table gran_premio
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS gran_premio (
  id_gran_premio INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  circuito VARCHAR(45) NOT NULL,
  vueltas INT NOT NULL,
  c_sabado JSON NOT NULL,
  clasificacion JSON NOT NULL,
  escuderia_id_escuderia INT NOT NULL,
  coche_id_coche INT NOT NULL,
  piloto_id_piloto INT NOT NULL,
  CONSTRAINT PK_id_gran_premio PRIMARY KEY (id_gran_premio),
  CONSTRAINT fk_gran_premio_escuderia1 FOREIGN KEY   (escuderia_id_escuderia) REFERENCES escuderia (id_escuderia),
  CONSTRAINT fk_gran_premio_coche1 FOREIGN KEY  (coche_id_coche) REFERENCES coche (id_coche),
  CONSTRAINT  fk_gran_premio_piloto1 FOREIGN KEY (piloto_id_piloto) REFERENCES piloto (id_piloto));
 


-- -----------------------------------------------------
-- Table campeonato
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS campeonato (
  id_campeonato INT NOT NULL AUTO_INCREMENT,
  clasificacion_c JSON NOT NULL,
  ganador VARCHAR(45) NOT NULL,
  gran_premio_id_gran_premio INT NOT NULL,
  CONSTRAINT PK_id_campeonato PRIMARY KEY (id_campeonato),
  CONSTRAINT fk_campeonato_gran_premio1 FOREIGN KEY (gran_premio_id_gran_premio)REFERENCES gran_premio (id_gran_premio));

insert into escuderia(nombre,color,nacionalidad,palmares,sede,jefe_equipo,jefe_tecnico,estrenada_f1) values ("Mercedes AMG Petronas F1 TEAM","Blanco/verde","Reino Unido",7,"Brackley/Brixworth, Gran Bretania","Toto Wolff","James Allison","1970");
insert into escuderia(nombre,color,nacionalidad,palmares,sede,jefe_equipo,jefe_tecnico,estrenada_f1) values ("Scuderia Ferrari Mission Winnow","Rojo/amarillo","Italia",16,"Maranello, Italia","Mattia Binotto",	"Simone Resta","1950");
insert into escuderia(nombre,color,nacionalidad,palmares,sede,jefe_equipo,jefe_tecnico,estrenada_f1) values ("Aston Martin Red Bull Racing","Azul/negro","Reino Unido",4,"Milton Keynes, Reino Unido","Christian Horner",	"Pierre Waché","1997");
insert into escuderia(nombre,color,nacionalidad,palmares,sede,jefe_equipo,jefe_tecnico,estrenada_f1) values ("BWT Racing Point F1 TEAM","Rosa/blanco","Reino Unido",0,"Silverstone, Reino Unido","Otmar Szafnauer",	"Andrew Green","2018");
insert into escuderia(nombre,color,nacionalidad,palmares,sede,jefe_equipo,jefe_tecnico,estrenada_f1) values ("McLaren F1 TEAM","Naranja/azul","Reino Unido",8,"Woking, Reino Unido","Andreas Seidl",	"James Key","1966");
insert into escuderia(nombre,color,nacionalidad,palmares,sede,jefe_equipo,jefe_tecnico,estrenada_f1) values ("Renault DP World F1 TEAM","Amarillo/negro","Reino Unido",2,"Enstone, Reino Unido","Cyril Abiteboul","TBC","1966");
insert into escuderia(nombre,color,nacionalidad,palmares,sede,jefe_equipo,jefe_tecnico,estrenada_f1) values ("Scuderia AlphaTauri Honda","Blanco/negro","Italia",2,"Faenza, Italia","Franz Tost","Jody Egginton","1985");
insert into escuderia(nombre,color,nacionalidad,palmares,sede,jefe_equipo,jefe_tecnico,estrenada_f1) values ("Alfa Romeo Racing ORLEN","Blanco/rojo","Suiza",2,"Hinwil, Suiza","Frédéric Vasseur","Jan Monchaux","1993");
insert into escuderia(nombre,color,nacionalidad,palmares,sede,jefe_equipo,jefe_tecnico,estrenada_f1) values ("Haas F1 TEAM","Blanco/negro","Estados Unidos",0,"Kannapolis, United States","Guenther Steiner","Rob Taylor","2016");
insert into escuderia(nombre,color,nacionalidad,palmares,sede,jefe_equipo,jefe_tecnico,estrenada_f1) values ("Williams Racing","Azul/blanco","Reino Unido",9,"Grove, Reino Unido","Simon Roberts","TBC","1978");


insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Lewis Hamilton","Reino Unido",19850107,"7(2008,2014,2015,2017,2018,2019)","activo","alberto la busca",163,(select id_escuderia from escuderia where nombre='Mercedes AMG Petronas F1 TEAM'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Valtteri Bottas","Filandia",19890828,"N/A","activo","alberto la busca",55,(select id_escuderia from escuderia where nombre='Mercedes AMG Petronas F1 TEAM'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Max Verstappen","Nueva Zelanda",19970930,"N/A","activo","alberto la busca",40,(select id_escuderia from escuderia where nombre='Aston Martin Red Bull Racing'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Alexander Albon","Thailandia",19960323,"N/A","activo","alberto la busca",1,(select id_escuderia from escuderia where nombre='Aston Martin Red Bull Racing'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Sebastian Vettel","Alemania",19870703,"4(2010,2011,2012,2013)","activo","alberto la busca",121,(select id_escuderia from escuderia where nombre='Scuderia Ferrari Mission Winnow'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Charles Leclerc","Monaco",19971016,"N/A","activo","alberto la busca",12,(select id_escuderia from escuderia where nombre='Scuderia Ferrari Mission Winnow'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Sergio Perez","Mexico",19900126,"N/A","activo","alberto la busca",9,(select id_escuderia from escuderia where nombre='BWT Racing Point F1 TEAM'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Lance Stroll","Canada",19981029,"N/A","activo","alberto la busca",2,(select id_escuderia from escuderia where nombre='BWT Racing Point F1 TEAM'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Daniel Ricciardo","Australia",19890701,"N/A","activo","alberto la busca",2,(select id_escuderia from escuderia where nombre='Renault DP World F1 TEAM'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Esteban Ocon","Francia",19960917,"N/A","activo","alberto la busca",0,(select id_escuderia from escuderia where nombre='Renault DP World F1 TEAM'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Carlos Sainz JR","Francia",19940901,"N/A","activo","alberto la busca",2,(select id_escuderia from escuderia where nombre='McLaren F1 TEAM'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Lando Norris","Reino Unido",19991113,"N/A","activo","alberto la busca",1,(select id_escuderia from escuderia where nombre='Mclaren F1 TEAM'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Pierre Gasly","Francia",19960207,"N/A","activo","alberto la busca",2,(select id_escuderia from escuderia where nombre='Scuderia AlphaTauri Honda'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Daniil Kvyat","Rusia",19940426,"N/A","activo","alberto la busca",3,(select id_escuderia from escuderia where nombre='Scuderia AlphaTauri Honda'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Kimi Räikkönen","Filandia",19791017,"1(2007)","activo","alberto la busca",103,(select id_escuderia from escuderia where nombre='Alfa Romeo Racing ORLEN'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Antonio Giovinazzi","Italia",19931214,"N/A","activo","alberto la busca",0,(select id_escuderia from escuderia where nombre='Alfa Romeo Racing ORLEN'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Romain Grosjean","Francia",19860417,"N/A","activo","alberto la busca",10,(select id_escuderia from escuderia where nombre='Haas F1 TEAM'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Kevin Magnussen","Dinamarca",19921005,"N/A","activo","alberto la busca",1,(select id_escuderia from escuderia where nombre='Haas F1 TEAM'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("George Russell","Estados Unidos",19980215,"N/A","activo","alberto la busca",0,(select id_escuderia from escuderia where nombre='Williams Racing'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Nicholas Latifi","Canada",19950629,"N/A","activo","alberto la busca",0,(select id_escuderia from escuderia where nombre='Williams Racing'));



