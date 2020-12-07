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
  año_primer_gp INT NOT NULL,
  longitud INT NOT NULL,
  distancia_gp INT NOT NULL,
  curvas INT NOT NULL,
  vueltas INT NOT NULL,
  CONSTRAINT PK_id_gran_premio PRIMARY KEY (id_gran_premio));


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


insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Lewis Hamilton","Reino Unido",19850107,"7(2008,2014,2015,2017,2018,2019)","activo","Lewis Carl Davidson Hamilton,​ MBE (Stevenage, Hertfordshire, Inglaterra, Reino Unido; 7 de enero de 1985), es un piloto británico de automovilismo. ... En Fórmula 1 desde 2007 hasta 2012, fue piloto de la escudería McLaren, con la cual fue campeón en 2008 y subcampeón en 2007.
",163,(select id_escuderia from escuderia where nombre='Mercedes AMG Petronas F1 TEAM'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Valtteri Bottas","Filandia",19890828,"N/A","activo","Valtteri Viktor Bottas (Nastola, Finlandia; 28 de agosto de 1989) es un piloto de automovilismo finlandés . ​ En la actualidad reside en Mónaco y desde 2017 compite para el equipo Mercedes en Fórmula 1. ... Resultó subcampeón en 2019, tercero en 2017, cuarto en 2014 y quinto en 2015 y 2018.
",55,(select id_escuderia from escuderia where nombre='Mercedes AMG Petronas F1 TEAM'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Max Verstappen","Nueva Zelanda",19970930,"N/A","activo","Max Emilian Verstappen (Hasselt, Bélgica; 30 de septiembre de 1997) es un piloto de automovilismo neerlandés. Nació en Bélgica, pero utiliza la nacionalidad de Países Bajos de su padre Jos, también piloto. Compite para el equipo Red Bull Racing en la Fórmula 1.​
Es el piloto más joven en liderar una vuelta durante un Gran Premio de Fórmula 1, el ganador más joven de un Gran Premio (18 años 7 meses y 15 días en el Gran Premio de España 2016),​ el piloto más joven en conseguir un podio, el más joven en lograr el récord de vuelta Gran Premio de Brasil 2016, el piloto más joven en lograr el récord de vuelta en una sesión, esta fue en la tercera práctica libre en el Autódromo Hermanos Rodríguez (México) el 28 de octubre de 2017 y el piloto más joven en competir en la historia de esta categoría, ya que hizo su debut con 17 años y 166 días.
",40,(select id_escuderia from escuderia where nombre='Aston Martin Red Bull Racing'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Alexander Albon","Thailandia",19960323,"N/A","activo","Alexander Albon (Londres, Inglaterra, Reino Unido; 23 de marzo de 1996) es un piloto de automovilismo tailandés-británico. Finalizó tercero el Campeonato de Fórmula 2 de la FIA 2018 con DAMS, y es piloto de Aston Martin Red Bull Racing en Fórmula 1 desde mediados de 2019.
",1,(select id_escuderia from escuderia where nombre='Aston Martin Red Bull Racing'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Sebastian Vettel","Alemania",19870703,"4(2010,2011,2012,2013)","activo","Sebastian Vettel (Heppenheim, Hesse, Alemania; 3 de julio de 1987) es un piloto alemán de automovilismo de velocidad. Llegó formando parte del Equipo Júnior de Red Bull desde los 11 años. Ha ganado cuatro títulos mundiales de Fórmula 1 con el equipo Red Bull en 2010, 2011, 2012 y 2013, más tres subcampeonatos en 2009, 2017 y 2018 estos dos últimos con el equipo Ferrari. Debutó en 2007 con el equipo BMW Sauber y participó en 2008 con el equipo Toro Rosso logrando su primera victoria en el Gran Premio de Italia de 2008.
",121,(select id_escuderia from escuderia where nombre='Scuderia Ferrari Mission Winnow'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Charles Leclerc","Monaco",19971016,"N/A","activo","Charles Marc Hervé Perceval Leclerc (Montecarlo, Mónaco; 16 de octubre de 1997), más conocido como Charles Leclerc, es un piloto de automovilismo monegasco. Es miembro de la Academia de Pilotos de Ferrari desde 2016, fue ganador del Campeonato de Fórmula 2 de la FIA con el equipo Prema en 2017. Debutó con el equipo Alfa Romeo Sauber F1 Team en 2018 y desde 2019 es piloto de la Scuderia Ferrari.
",12,(select id_escuderia from escuderia where nombre='Scuderia Ferrari Mission Winnow'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Sergio Perez","Mexico",19900126,"N/A","activo","Sergio Michel Pérez Mendoza (Guadalajara, Jalisco, México; 26 de enero de 1990) también conocido como Checo Pérez, es un piloto de automovilismo mexicano. Inició su carrera en monoplazas en 2004. Tres años más tarde fue campeón de la Clase Nacional de Fórmula 3 Británica. Debutó en GP2 Series en 2009 y al año siguiente fue subcampeón con Addax Team.
Hizo su debut en Fórmula 1 en 2011 con Sauber. En la temporada siguiente logró tres podios y pasó a McLaren para 2013. Tras una temporada en el equipo británico, fue contratado por Force India, que luego pasó a ser Racing Point. En estos dos, subió al podio en seis carreras.
",9,(select id_escuderia from escuderia where nombre='BWT Racing Point F1 TEAM'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Lance Stroll","Canada",19981029,"N/A","activo","Lance Stroll (Montreal, Canadá; 29 de octubre de 1998) es un piloto canadiense de automovilismo de velocidad. Ganó los campeonatos de Fórmula 4 Italiana en 2015 y Fórmula 3 Europea en 2016. Disputó las temporadas 2017 y 2018 con Williams en Fórmula 1, pero a partir de 2019 es piloto de Racing Point.
",2,(select id_escuderia from escuderia where nombre='BWT Racing Point F1 TEAM'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Daniel Ricciardo","Australia",19890701,"N/A","activo","Daniel Joseph Ricciardo (Perth, Australia; 1 de julio de 1989) es un piloto de automovilismo australiano de ascendencia italiana. Ganó la Fórmula 3 Británica en el año 2009 y desde 2011 es piloto de Fórmula 1. Entre 2014 y 2018 compitió en Red Bull, desde la temporada 2019 es titular en el equipo Renault.​
Ha logrado siete victorias, tres pole positions y treinta y un podios en Fórmula 1, lo que lo llevó a quedar tercero en las temporadas 2014 y 2016, solo por detrás de los Mercedes de Hamilton y Rosberg.
",2,(select id_escuderia from escuderia where nombre='Renault DP World F1 TEAM'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Esteban Ocon","Francia",19960917,"N/A","activo","Esteban Ocon (Évreux, Francia; 17 de septiembre de 1996) es un piloto francés de automovilismo de velocidad.​ Fue campeón de Fórmula 3 Europea y GP3 Series. Debutó en Fórmula 1 en 2016 con Manor y más tarde compitió para Force India/Racing Point. Luego de un año de desarrollo con Mercedes, volvió a este campeonato de la mano de Renault.
",0,(select id_escuderia from escuderia where nombre='Renault DP World F1 TEAM'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Carlos Sainz JR","Francia",19940901,"N/A","activo","Carlos Sainz Vázquez de Castro (Madrid, España; 1 de septiembre de 1994), más conocido como Carlos Sainz Jr. o simplemente Carlos Sainz, es un piloto de automovilismo español. En 2014 ganó el campeonato de Formula Renault 3.5 Series. Desde 2019 es titular del equipo McLaren. Es hijo del expiloto y campeón del Campeonato Mundial de Rally.
",2,(select id_escuderia from escuderia where nombre='McLaren F1 TEAM'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Lando Norris","Reino Unido",19991113,"N/A","activo","Lando Norris (Brístol, Reino Unido; 13 de noviembre de 1999) es un piloto de automovilismo que compite bajo nacionalidad británica, aunque posee también nacionalidad belga.​ Fue campeón de Fórmula 3 Europea en 2017 y subcampeón de Fórmula 2 en 2018 con el equipo Carlin.
Desde 2019 forma parte de la plantilla de pilotos de McLaren, junto a Carlos Sainz Jr.
",1,(select id_escuderia from escuderia where nombre='Mclaren F1 TEAM'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Pierre Gasly","Francia",19960207,"N/A","activo","Pierre Gasly (Ruan, Francia; 7 de febrero de 1996) es un piloto de automovilismo de velocidad francés. Campeón de la Eurocopa Fórmula Renault 2.0 en 2013 y de GP2 Series en 2016. Debutó en Toro Rosso en la temporada 2017 de Fórmula 1.Ese año también fue subcampeón de Super Fórmula Japonesa. En 2019 disputó las 12 primeras carreras con el equipo Red Bull Racing, pero la escudería austríaca decidió prescindir de él. Actualmente es piloto de la escudería Scuderia AlphaTauri.
",2,(select id_escuderia from escuderia where nombre='Scuderia AlphaTauri Honda'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Daniil Kvyat","Rusia",19940426,"N/A","activo","Daniil Viacheslavovich Kvyat (en ruso: Даниил Вячеславович Квят; Ufá, Baskortostán, Rusia, 26 de abril de 1994) es un piloto ruso de automovilismo de velocidad. En 2012 fue campeón de la Fórmula Renault 2.0 con 7 victorias. En 2013 compitió en Fórmula 3 Europea como invitado y se proclamó campeón de la cuarta temporada de GP3 Series. Debutó en Fórmula 1 en Scuderia Toro Rosso para la temporada 2014. En este campeonato, ha competido también con el equipo Red Bull, y en total ha sumado tres podios. En 2019 volvió a competir con Toro Rosso.
",3,(select id_escuderia from escuderia where nombre='Scuderia AlphaTauri Honda'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Kimi Räikkönen","Filandia",19791017,"1(2007)","activo","Kimi-Matias Räikkönen (Espoo, Finlandia; 17 de octubre de 1979), conocido como Iceman, es un piloto de automovilismo finlandés. Fue campeón mundial de Fórmula 1 en 2007 con Ferrari, subcampeón en 2003 y 2005 con McLaren, y tercero en 2008, 2012 (con Lotus) y 2018 (con Scuderia Ferrari).
Tras la temporada 2009, el piloto cambió de disciplina para competir en el Campeonato Mundial de Rally para Citroën.Räikkönen retornó a Fórmula 1 en 2012 para pilotar para Lotus, quedando tercero en el campeonato mundial de pilotos. La temporada 2014 marcó su retorno a Ferrari, defendiendo los colores del equipo de Maranello junto a Fernando Alonso. 
",103,(select id_escuderia from escuderia where nombre='Alfa Romeo Racing ORLEN'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Antonio Giovinazzi","Italia",19931214,"N/A","activo","Antonio Giovinazzi (Martina Franca, Italia; 14 de diciembre de 1993) es un piloto de automovilismo de velocidad italiano. Fue subcampeón en F3 Europea y GP2 Series, y es piloto de Alfa Romeo desde la temporada 2019 de Fórmula 1.
",0,(select id_escuderia from escuderia where nombre='Alfa Romeo Racing ORLEN'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Romain Grosjean","Francia",19860417,"N/A","activo","Romain Grosjean (Ginebra, Suiza, 17 de abril de 1986) es un piloto de automovilismo francés. Fue campeón de la Fórmula 3 Euroseries 2007 y la GP2 Series 2011. Grosjean ha disputado en Fórmula 1 en 2009 para Renault, en 2012-2015 para Lotus y desde 2016 es piloto del equipo Haas. El piloto ha conseguido diez podios a lo largo de su carrera como piloto de la F1.
",10,(select id_escuderia from escuderia where nombre='Haas F1 TEAM'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Kevin Magnussen","Dinamarca",19921005,"N/A","activo","Kevin Magnussen (Roskilde, Dinamarca, 5 de octubre de 1992) es un piloto danés de automovilismo de velocidad.​ Es hijo del piloto retirado de Fórmula 1 Jan Magnussen. En 2013 ganó el campeonato de Formula Renault 3.5 Series y fue miembro del Programa de Jóvenes Pilotos de McLaren. Debutó en Fórmula 1 en 2014 con el equipo McLaren con un segundo puesto en su primera carrera. Posteriormente compitió con Renault en 2016. En la temporada 2017, cambió de equipo y desde entonces es compañero de Romain Grosjean en la escudería estadounidense Haas F1 Team.
",1,(select id_escuderia from escuderia where nombre='Haas F1 TEAM'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("George Russell","Estados Unidos",19980215,"N/A","activo","George Russell (King's Lynn, Norfolk, Inglaterra, Reino Unido; 15 de febrero de 1998) es un piloto británico de automovilismo.En 2017 fue campeón de la GP3 Series y en 2018 del Campeonato de Fórmula 2 de la FIA con ART. Desde 2019 forma parte del equipo Williams en Fórmula 1.
",0,(select id_escuderia from escuderia where nombre='Williams Racing'));
insert into piloto(nombre,nacionalidad,fecha_nacimiento,palmares,estado,bibliografia,podios,escuderia_id_escuderia)values ("Nicholas Latifi","Canada",19950629,"N/A","activo","Nicholas Latifi (Montreal, Canadá; 29 de junio de 1995) es un piloto canadiense de automovilismo. En 2019 fue subcampeón del Campeonato de Fórmula 2 de la FIA con DAMS. Actualmente es piloto titular del equipo Williams en Fórmula 1.
",0,(select id_escuderia from escuderia where nombre='Williams Racing'));



insert into gran_premio(nombre,año_primer_gp,longitud,distancia_gp,curvas,vueltas) values ("GP DE AUSTRIA F1 2020",1964,4.326,307.146,9,71);
insert into gran_premio(nombre,año_primer_gp,longitud,distancia_gp,curvas,vueltas) values ("GP DE ESTIRIA F1 2020",2020,4.326,307.146,9,71);
insert into gran_premio(nombre,año_primer_gp,longitud,distancia_gp,curvas,vueltas) values ("GP DE HUNGRÍA F1 2020",1986,4.381,306.670,14,70);
insert into gran_premio(nombre,año_primer_gp,longitud,distancia_gp,curvas,vueltas) values ("GP DE GRAN BRETAÑA F1 2020",1950,5.891,306.332,18,52);
insert into gran_premio(nombre,año_primer_gp,longitud,distancia_gp,curvas,vueltas) values ("GP DEL 70º ANIVERSARIO F1",2020,5.891,306.332,18,52);
insert into gran_premio(nombre,año_primer_gp,longitud,distancia_gp,curvas,vueltas) values ("GP DE ESPAÑA F1 2020",1951,4.655,307.230,16,66);
insert into gran_premio(nombre,año_primer_gp,longitud,distancia_gp,curvas,vueltas) values ("GP DE BÉLGICA F1 2020",1950,7.004,308.176,19,44);
insert into gran_premio(nombre,año_primer_gp,longitud,distancia_gp,curvas,vueltas) values ("GP DE ITALIA F1 2020",1950,5.793,307.029,11,53);
insert into gran_premio(nombre,año_primer_gp,longitud,distancia_gp,curvas,vueltas) values ("GP DE LA TOSCANA F1 2020",2020,5.245,277.985,15,53);
insert into gran_premio(nombre,año_primer_gp,longitud,distancia_gp,curvas,vueltas) values ("GP DE RUSIA F1 2020",2014,5.848,309.944,18,53);
insert into gran_premio(nombre,año_primer_gp,longitud,distancia_gp,curvas,vueltas) values ("GP DE EIFEL F1 2020",2020,5.148,308.880,15,60);
insert into gran_premio(nombre,año_primer_gp,longitud,distancia_gp,curvas,vueltas) values ("GP DE PORTUGAL F1 2020",1958,4.182,305.286,15,73);
insert into gran_premio(nombre,año_primer_gp,longitud,distancia_gp,curvas,vueltas) values ("GP DE LA EMILIA ROMAÑA F1 2020",2020,4.909,309.267,21,63);
insert into gran_premio(nombre,año_primer_gp,longitud,distancia_gp,curvas,vueltas) values ("GP DE TURQUÍA F1 2020",2005,5.338,309.604,14,58);
insert into gran_premio(nombre,año_primer_gp,longitud,distancia_gp,curvas,vueltas) values ("GP DE BARÉIN F1 2020",2004,5.412,308.484,15,57);
insert into gran_premio(nombre,año_primer_gp,longitud,distancia_gp,curvas,vueltas) values ("GP DE SAKHIR F1 2020",2020,3.543,308.241,11,87);
insert into gran_premio(nombre,año_primer_gp,longitud,distancia_gp,curvas,vueltas) values ("GP DE ABU DHABI F1 2020",2009,5.554,305.355,21,55);








