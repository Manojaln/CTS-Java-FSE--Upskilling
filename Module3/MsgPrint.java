class MsgPrint implements Runnable {
    private String msg;

    public MsgPrint(String msg) {
        this.msg = msg;
    }

    public void run() {
        for (int in = 1; in <= 5; in++) {
            System.out.println(msg + " - " + in);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }

public static void main(String[] args) {
       Thread tone = new Thread(new MsgPrint("Hello from Thread 1"));
       	 Thread ttwo = new Thread(new MsgPrint("Hello from Thread 2"));

        	tone.start(); 
        	ttwo.start(); 
    }

}
    
