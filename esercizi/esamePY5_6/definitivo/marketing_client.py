
import requests
import json

# Funzione per ottenere il report vendite e affitti
def report_vendite_affitti():
    start_date = input("Inserisci la data di inizio (YYYY-MM-DD): ")
    end_date = input("Inserisci la data di fine (YYYY-MM-DD): ")


    url = 'http://127.0.0.1:5001/reportVenditeAffitti'

    
    payload = {
        'start_date': start_date,
        'end_date': end_date
    }

    
    response = requests.post(url, json=payload)

    if response.status_code == 200:
        data = response.json()
        if data:
            print("Report Vendite/Affitti:")
            for entry in data:
                print(f"Filiale: {entry['filiale']}, Mese: {entry['mese']}, "
                      f"Numero Case Vendute: {entry['numero_vendite']}, "
                      f"Numero Case Affittate: {entry['numero_affitti']}")
        else:
            print("Nessun dato trovato per il periodo richiesto.")
    else:
        print("Errore durante la richiesta al server.")

# Funzione per calcolare i guadagni per filiale
def guadagno_filiale():
    start_date = input("Inserisci la data di inizio (YYYY-MM-DD): ")
    end_date = input("Inserisci la data di fine (YYYY-MM-DD): ")

    
    url = 'http://127.0.0.1:5001/guadagniFiliale'

    payload = {
        'start_date': start_date,
        'end_date': end_date
    }

    
    response = requests.post(url, json=payload)

    if response.status_code == 200:
        data = response.json()
        if data:
            print("Guadagni per Filiale:")
            for entry in data:
                print(f"Filiale: {entry['filiale']}, Mese: {entry['mese']}, "
                      f"Numero Vendite: {entry['numero_vendite']}, "
                      f"Numero Affitti: {entry['numero_affitti']}, "
                      f"Guadagno Totale: {entry['guadagno']}")
        else:
            print("Nessun dato trovato per il periodo richiesto.")
    else:
        print("Errore durante la richiesta al server.")

def menu():
    while True:
        print("\nBenvenuto nel sistema di marketing immobiliare!")
        print("1. Report vendite e affitti")
        print("2. Calcolare guadagno per filiale")
        print("3. Uscire")

        # Chiediamo all'utente cosa desidera fare
        choice = input("Scegli un'opzione (1/2/3): ")

        if choice == '1':
            report_vendite_affitti()
        elif choice == '2':
            guadagno_filiale()
        elif choice == '3':
            print("Uscita dal programma.")
            break
        else:
            print("Opzione non valida, per favore scegli di nuovo.")

if __name__ == '__main__':
    menu()