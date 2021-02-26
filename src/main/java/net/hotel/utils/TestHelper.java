package net.hotel.utils;

public final class TestHelper {

    private TestHelper() {

    }

    public static void sleepSeconds(int secondsToSleep){
        try {
            Thread.sleep (secondsToSleep*1000);
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
    }
}
