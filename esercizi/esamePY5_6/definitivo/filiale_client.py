

import requests
import json

# Imposta l'URL del server Flask
server_url = "http://127.0.0.1:5001"  

def cerca_case_vendita(indirizzo, prezzo_min, prezzo_max):
    payload = {
        "indirizzo": indirizzo,
        "prezzo_min": prezzo_min,
        "prezzo_max": prezzo_max
    }
    response = requests.post(f"{server_url}/cercaCasaVendita", json=payload)
    if response.status_code == 200:
        return response.json()
    else:
        print(f"Errore durante la ricerca delle case in vendita: {response.status_code}")
        return []

def cerca_case_affitto(indirizzo, prezzo_min, prezzo_max):
    payload = {
        "indirizzo": indirizzo,
        "prezzo_min": prezzo_min,
        "prezzo_max": prezzo_max
    }
    response = requests.post(f"{server_url}/cercaCasaAffitto", json=payload)
    if response.status_code == 200:
        return response.json()
    else:
        print(f"Errore durante la ricerca delle case in affitto: {response.status_code}")
        return []

def vendi_casa(catastale, prezzo_vendita):
    payload = {
        "catastale": catastale,
        "prezzo_vendita": prezzo_vendita
    }
    response = requests.post(f"{server_url}/vendiCasa", json=payload)
    if response.status_code == 200:
        print(f"Casa venduta con successo! {catastale} - {prezzo_vendita}")
    else:
        print(f"Errore durante la vendita della casa: {response.status_code}")

def affitta_casa(catastale, prezzo_affitto, durata_contratto):
    payload = {
        "catastale": catastale,
        "prezzo_affitto": prezzo_affitto,
        "durata_contratto": durata_contratto
    }
    response = requests.post(f"{server_url}/affittaCasa", json=payload)
    if response.status_code == 200:
        print(f"Casa affittata con successo! {catastale} - {prezzo_affitto}€/mese")
    else:
        print(f"Errore durante l'affitto della casa: {response.status_code}")

def menu():
    while True:
        print("\n--- Menu Filiale ---")
        print("1. Cerca case in vendita")
        print("2. Cerca case in affitto")
        print("3. Vendi una casa")
        print("4. Affitta una casa")
        print("5. Esci")

        scelta = input("Scegli un'opzione (1-5): ")

        if scelta == '1':
            indirizzo = input("Inserisci l'indirizzo della casa (es. Roma): ")
            prezzo_min = int(input("Inserisci il prezzo minimo: "))
            prezzo_max = int(input("Inserisci il prezzo massimo: "))
            case_vendita = cerca_case_vendita(indirizzo, prezzo_min, prezzo_max)
            if case_vendita:
                print("Case in vendita trovate:")
                for case in case_vendita:
                    print(case)
            else:
                print("Nessuna casa trovata.")
        
        elif scelta == '2':
            indirizzo = input("Inserisci l'indirizzo della casa (es. Roma): ")
            prezzo_min = int(input("Inserisci il prezzo minimo: "))
            prezzo_max = int(input("Inserisci il prezzo massimo: "))
            case_affitto = cerca_case_affitto(indirizzo, prezzo_min, prezzo_max)
            if case_affitto:
                print("Case in affitto trovate:")
                for case in case_affitto:
                    print(case)
            else:
                print("Nessuna casa trovata.")
        
        elif scelta == '3':
            catastale = input("Inserisci il codice catastale della casa: ")
            prezzo_vendita = int(input("Inserisci il prezzo di vendita: "))
            vendi_casa(catastale, prezzo_vendita)
        
        elif scelta == '4':
            catastale = input("Inserisci il codice catastale della casa: ")
            prezzo_affitto = int(input("Inserisci il prezzo mensile di affitto: "))
            durata_contratto = int(input("Inserisci la durata del contratto in mesi: "))
            affitta_casa(catastale, prezzo_affitto, durata_contratto)
        
        elif scelta == '5':
            print("Uscita dal programma.")
            break
        
        else:
            print("Opzione non valida. Riprova.")

if __name__ == "__main__":
    menu()
