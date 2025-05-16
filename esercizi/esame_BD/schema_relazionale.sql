

CREATE TABLE Utente(
    cf varchar not null,
    nome varchar not null,
    cognome varchar not null,
    primary key (cf)
);

CREATE TABLE Noleggio(
    id integer not null,
    inizio timestamp not null,
    fine timestamp, 
    terminato Boolean,
    utente varchar not null,
    veicolo varchar not null,
    primary key (id),
    foreign key (utente) references Utente(cf),
    foreign key (veicolo) references Veicolo(targa)
);

CREATE TABLE Veicolo(
    targa varchar not null,
    primary key (targa)
);

CREATE TABLE Sinistro(
    id integer not null, 
    istante timestamp not null,
    veicolo varchar not null,
    primary key (id),
    foreign key (veicolo) references Veicolo(targa)
);



