import sqlite3


conn = sqlite3.connect('societa_immobiliare.db')
cursor = conn.cursor()

# Inserimento case in vendita
cursor.execute('''INSERT OR REPLACE INTO case_in_vendita 
                  (catastale, indirizzo, numero_civico, piano, metri, vani, prezzo, stato, filiale_proponente) 
                  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)''', 
               ('AB123', 'Roma', '1', 2, 100, 4, 300000, 'LIBERO', 'Filiale 1'))

cursor.execute('''INSERT OR REPLACE INTO case_in_vendita 
                  (catastale, indirizzo, numero_civico, piano, metri, vani, prezzo, stato, filiale_proponente) 
                  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)''', 
               ('BC456', 'Roma', '2', 3, 120, 5, 400000, 'LIBERO', 'Filiale 2'))

cursor.execute('''INSERT OR REPLACE INTO case_in_vendita 
                  (catastale, indirizzo, numero_civico, piano, metri, vani, prezzo, stato, filiale_proponente) 
                  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)''', 
               ('DE101112', 'Milano', '4', 4, 180, 2, 600000, 'LIBERO', 'Filiale 2'))


cursor.execute('''INSERT OR REPLACE INTO case_in_vendita 
                  (catastale, indirizzo, numero_civico, piano, metri, vani, prezzo, stato, filiale_proponente) 
                  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)''', 
               ('CD789', 'Milano', '3', 1, 80, 3, 250000, 'OCCUPATO', 'Filiale 1'))

# Inserimento case in affitto
cursor.execute('''INSERT OR REPLACE INTO case_in_affitto 
                  (catastale, indirizzo, civico, tipo_affitto, bagno_personale, prezzo_mensile, filiale_proponente) 
                  VALUES (?, ?, ?, ?, ?, ?, ?)''', 
               ('EF101', 'Roma', '5', 'PARZIALE', True, 1500, 'Filiale 1'))

cursor.execute('''INSERT OR REPLACE INTO case_in_affitto 
                  (catastale, indirizzo, civico, tipo_affitto, bagno_personale, prezzo_mensile, filiale_proponente) 
                  VALUES (?, ?, ?, ?, ?, ?, ?)''', 
               ('GH202', 'Milano', '10', 'TOTALE', False, 2000, 'Filiale 2'))

# Inserimento filiali
cursor.execute('''INSERT OR REPLACE INTO filiali (partita_iva, nome, indirizzo_sede, civico, telefono) 
                  VALUES (?, ?, ?, ?, ?)''', 
               ('12345678901', 'Filiale 1', 'Via Roma', '100', '0612345678'))

cursor.execute('''INSERT OR REPLACE INTO filiali (partita_iva, nome, indirizzo_sede, civico, telefono) 
                  VALUES (?, ?, ?, ?, ?)''', 
               ('98765432100', 'Filiale 2', 'Via Milano', '200', '0298765432'))

# Inserimento vendite
cursor.execute('''INSERT OR REPLACE INTO vendite_casa 
                  (catastale, data_vendita, filiale_proponente, filiale_venditrice, prezzo_vendita) 
                  VALUES (?, ?, ?, ?, ?)''', 
               ('AB123', '2025-01-01', 'Filiale 1', 'Filiale 1', 300000))

cursor.execute('''INSERT OR REPLACE INTO vendite_casa 
                  (catastale, data_vendita, filiale_proponente, filiale_venditrice, prezzo_vendita) 
                  VALUES (?, ?, ?, ?, ?)''', 
               ('BC456', '2025-01-05', 'Filiale 2', 'Filiale 2', 400000))

# Inserimento affitti
cursor.execute('''INSERT OR REPLACE INTO affitti_casa 
                  (catastale, data_affitto, filiale_proponente, filiale_venditrice, prezzo_affitto, durata_contratto) 
                  VALUES (?, ?, ?, ?, ?, ?)''', 
               ('EF101', '2025-01-03', 'Filiale 1', 'Filiale 2', 1500, 12))

cursor.execute('''INSERT OR REPLACE INTO affitti_casa 
                  (catastale, data_affitto, filiale_proponente, filiale_venditrice, prezzo_affitto, durata_contratto) 
                  VALUES (?, ?, ?, ?, ?, ?)''', 
               ('GH202', '2025-01-10', 'Filiale 2', 'Filiale 2', 2000, 24))


conn.commit()


conn.close()

print("Dati di esempio inseriti con successo!")
