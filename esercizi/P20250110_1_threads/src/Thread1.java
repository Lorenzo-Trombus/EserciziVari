
class Thread1 extends Thread {
    
    @Override
    public void run() {
        
        System.out.println("Il thread è in esecuzione!");
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Il thread ha terminato!");
    }
}
