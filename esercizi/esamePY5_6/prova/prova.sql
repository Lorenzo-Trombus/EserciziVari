CREATE TABLE Case_in_vendita(
    catastale varchar (50) PRIMARY KEY,
    indirizzo varchar (255) not null,
    numero_civico int not null,
    piano int not null,
    metri float not null,
    vani int not null,
    prezzo float not null,
    stato ENUM ('LIBERO', 'OCCUPATO') not null,
    filiale_proponente varchar (50) not null,
    FOREIGN KEY (filiale_proponente) REFERENCES filiali(partita_iva)
);

CREATE TABLE Case_in_affitto(
    catastale varchar (50) PRIMARY KEY,
    indirizzo varchar (255) not null,
    numero_civico int not null,
    tipo_affitto varchar (50) not null CHECK(tipo_affitto) IN ('PARZIALE','TOTALE'),
    bagno_personale BOOLEAN not null,
    prezzo_mensile float not null,
    filiale_proponente varchar (50) not null,
    foreing key (filiale_proponente) REFERENCES filiali (partita_iva)
);

CREATE TABLE filiali(
    partita_iva varchar (50) primary key,
    nome varchar (100) not null,
    indirizzo_sede varchar (100) not null,
    civico int not null,
    telefono varchar(25) not null
);

CREATE TABLE vendite_casa(
    catastale varchar (50) primary key,
    data_vendita DATE not null,
    filiale_proponente varchar (50) not null,
    filiale_venditrice varchar (50) not null,
    prezzo_vendita varchar (50) not null,
    FOREIGN KEY (filiale_proponente) REFERENCES filiali(partita_iva),
    FOREIGN KEY (filiale_venditrice) REFERENCES filiali(partita_iva)
);

CREATE TABLE affitti_casa(
   catastale varchar (50) primary key,
   data_affitto DATE not null,
   filiale_proponente varchar (50) not null,
   filiale_venditrice varchar (50) not null,
   prezzo_affitto float not null,
   durata_contratto DATE not null,
   FOREIGN KEY (filiale_proponente) REFERENCES filiali(partita_iva),
   FOREIGN KEY (filiale_venditrice) REFERENCES filiali(partita_iva)
);