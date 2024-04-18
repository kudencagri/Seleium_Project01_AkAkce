package Utlity;

public class MyFunc {
    public static void wait(int sn){

        try {
            Thread.sleep(sn*1000l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
