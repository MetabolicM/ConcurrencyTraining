package First;

public class SimpleRunnable implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(500);
            System.out.println();
        }catch (Exception e){
            System.out.println("down!");
        }

    }
}
