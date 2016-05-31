package runnable;

public class threadExample implements Runnable {

    Thread thread = null;
    String namaThread = "";
    int putaran = 0;

    public threadExample(String namaThread) {

        this.namaThread = namaThread;
        thread = new Thread(this);
        thread.start();

    }
    
    @Override
    public void run() {
        while (thread != null) {
            try {
                System.out.println(namaThread + " - putaran " + putaran);
                thread.sleep(1000);
                putaran++;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
