package thread;

public class threadExample extends Thread {

    String namaThread = "";
    int putaran = 0;

    public threadExample(String namaThread) {
        this.namaThread = namaThread;
    }

    @Override
    public void run() {
        while (this != null) {
            try {
                System.out.println(namaThread + " - putaran " + putaran);
                Thread.sleep(1000);
                putaran++;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
