import sqlite3

# Crea una connessione al database
conn = sqlite3.connect('societa_immobiliare.db')
cursor = conn.cursor()

# Crea le tabelle
cursor.execute('''CREATE TABLE IF NOT EXISTS case_in_vendita (
    catastale TEXT PRIMARY KEY,
    indirizzo TEXT,
    numero_civico TEXT,
    piano INTEGER,
    metri INTEGER,
    vani INTEGER,
    prezzo INTEGER,
    stato TEXT CHECK(stato IN ('LIBERO', 'OCCUPATO')),
    filiale_proponente TEXT
)''')

cursor.execute('''CREATE TABLE IF NOT EXISTS case_in_affitto (
    catastale TEXT PRIMARY KEY,
    indirizzo TEXT,
    civico TEXT,
    tipo_affitto TEXT CHECK(tipo_affitto IN ('PARZIALE', 'TOTALE')),
    bagno_personale BOOLEAN,
    prezzo_mensile INTEGER,
    filiale_proponente TEXT
)''')

cursor.execute('''CREATE TABLE IF NOT EXISTS filiali (
    partita_iva TEXT PRIMARY KEY,
    nome TEXT,
    indirizzo_sede TEXT,
    civico TEXT,
    telefono TEXT
)''')

cursor.execute('''CREATE TABLE IF NOT EXISTS vendite_casa (
    catastale TEXT,
    data_vendita TEXT,
    filiale_proponente TEXT,
    filiale_venditrice TEXT,
    prezzo_vendita INTEGER,
    FOREIGN KEY(catastale) REFERENCES case_in_vendita(catastale)
)''')

cursor.execute('''CREATE TABLE IF NOT EXISTS affitti_casa (
    catastale TEXT,
    data_affitto TEXT,
    filiale_proponente TEXT,
    filiale_venditrice TEXT,
    prezzo_affitto INTEGER,
    durata_contratto INTEGER,
    FOREIGN KEY(catastale) REFERENCES case_in_affitto(catastale)
)''')


conn.commit()


conn.close()

print("Database e tabelle creati con successo!")
