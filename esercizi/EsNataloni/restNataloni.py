import psycopg2

host = "localhost"
port="5432"
dbname = "Accademia"
user="postgres"
password="postgres"

try:
    connection = psycopg2.connect(
        host=host,
        port=port,
        dbname=dbname,
        user=user,
        password=password,
    )
    print("Connessione al database avvenuta con successo")
except Exception as e:
    print(f"Errore durante la connessione al database:{e}")

cursor= connection.cursor()
scelta=0

while scelta !=5:
    print("scegli cosa fare:")
    print("1: visualizza la tabella Persona\n 2: visualizza la tabella WB\n 3: visualizza la tabella assenza\n 4: scegli la tabella da visualizzare\n 5: Esci")
    scelta = int(input())

    if scelta == 1: 
        cursor.execute("SELECT * FROM persona ")


        rows= cursor.fetchall()
        for row in rows:
            print(row)

    elif scelta== 2:
        cursor.execute("SELECT * FROM WB ")


        rows= cursor.fetchall()
        for row in rows:
            print(row)

    elif scelta == 3: 
        cursor.execute("SELECT * FROM assenza ")


        rows= cursor.fetchall()
        for row in rows:
            print(row)

    elif scelta==4: 
        print("seleziona la/e tabelle")
        cursor.execute(f"SELECT * FROM {input()} ")

        try:
            rows= cursor.fetchall()
            for row in rows:
                print(row)
        except Exception as e:
            print(e)
    


    


