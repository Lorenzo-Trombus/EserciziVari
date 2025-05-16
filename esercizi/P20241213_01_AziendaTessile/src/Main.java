/*
  * Un'azienda manufatturiera ha un gruppo di macchine filatrici che producono
  * tessuti di tipo differente.
  * - Cotone
  * - Lino
  * - Lana
  * - Seta
  * - Poliestere
  * - Nylon
  * Ogni filatrice è governata da un'applicazione software che scrive 
  * su un file (specifico della filatrice) a intervalli regolari la 
  * quantità (in metri) e il tipo di tessuto prodotto.
  * 
  * Tutti i file sono scritti su un file system condiviso in modo da
  * consentirne l'uso da parte di un gestore centralizzato.
  * L'applicazione per la gestione centralizzata è organizzata in due moduli principali
  * - modulo produttore
  *  - legge ciclicamente i file prodotti dalle varie filatrici e appende
  *    i dati di produzione in una coda (LinkedBlockingQueue) che gestisce automaticamente
  *    la concorrenza degli accessi
  * - modulo consumatore
  *  - acquisisce i dati di produzione dalla linkedblockingqueue e forma dei report
  *    su base oraria che stampano i totali di produzione per ogni macchina e per 
  *    ogni tipologia di tessuto
  *    NB: una filatrice può produrre tipi di dfferenti di tessuto
  * 
  * Realizzare una soluzione software basata su 2 applicazioni (che simulano le filatrici)
  * e ogni 10 secondi (per semplicità del testing) aggiornano i file di produzione.
  * I file di produzione hanno un nome che corrisponde al numero della filatrice
  * Esempio: sia <filatrice> il nome dell'app filatrice
  *  con il comando <java filatrice 3> attivo l'applicazione filatrice 
  *  assegnandogli il numero 3.
  *  Questa, ogni 10 secondi, scriverà nel file produzione_filatrice_1.dat
  *  una riga (in formato JSON) che descrive l'elenco e la quantità dei tessuti prodotti
  *  
  *  Il programma di gestione, attraverso il modulo produttore, scandisce ciclicamente i
  *  file produzione_filatrice_1.dat e produzione_filatrice_2.dat (sono due macchine)
  *  legge i dati e li mette in coda.
  *  il modulo consumatore, legge dalla coda, accumula per macchina e accumula per
  *  tessuto e ogni minuto stampa un report sui livelli di produzione
  *  
  *  Opzionale: se il report fosse stampato in un file CSV allora con excel 
  *  si potrebbe leggere e graficizzare
  * */




import java.io.IOException;
import java.util.Random;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Main {


 public static void main(String[] args) {


 new Filatrice(1).start();
 new Filatrice(2).start();
 }
 
}
class Filatrice extends Thread {
 int id;
 public Filatrice(int id) {
 this.id=id;
 }
 public void run() {
 String nomeFile = "/tmp/filatrice_" + id + ".dat";
 String[] tessuti = {"Cotone", "Lino", "Lana", "Seta", "Poliestere", "Nylon"};
 Random rng = new Random();
 
 //Creo l'object mapper per convertire in json al di fuori del ciclo
 ObjectMapper om = new ObjectMapper();


 while (true) {
 try {
 Thread.sleep(10);
 } catch (InterruptedException e) {
 // TODO Auto-generated catch block
 e.printStackTrace();
 }
 //Genera tessuto e quantità
 String tessuto = tessuti[rng.nextInt(0, tessuti.length)];
 int metri = rng.nextInt(20, 60);
 
 //Per comodità utilizzo una classe produzione che contiene tessuto e metraggio
 Produzione prodotto = new Produzione(tessuto, metri);
 
 //Ora converto in stringa JSON
 String js;
 try {
 js = om.writeValueAsString(prodotto);
 } catch (JsonProcessingException e) {
 // TODO Auto-generated catch block
 e.printStackTrace();
 continue; //Riparto con il loop!! non posso scrivere
 }
 
 //Ora salvo su file
 var toAppend = Util.OpenFileForAppend(nomeFile);
 try {
 toAppend.write(js);
 } catch (IOException e) {
 // TODO Auto-generated catch block
 e.printStackTrace();
 continue; //Riparto con il loop, non sono riuscito a aprire il file
 }
 try {
 toAppend.close();
 } catch (IOException e) {
 // TODO Auto-generated catch block
 e.printStackTrace();
 }
 }
 }
}


class Produzione{
 String prodotto;
 int metraggio;
 public Produzione(String prodotto, int metraggio) {
 super();
 this.prodotto = prodotto;
 this.metraggio = metraggio;
 }
 
}
