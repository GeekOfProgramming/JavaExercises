public class TestMyTime {
    public static void main(String[] args) {
        // Test constructors and toString()
        MyTime t1 = new MyTime(1, 2, 3);
        System.out.println(t1);

        // Test Setters and Getters
        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println(t1);
        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());

        // Test setTime()
        t1.setTime(23, 59, 58);
        System.out.println(t1); // toString()

        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond());

        System.out.println(t1.previousSecond());
        System.out.println(t1.previousSecond().previousSecond());
    }

    /*
     * 01:02:03
     * 04:05:06
     * Hour: 4
     * Minute: 5
     * Second: 6
     * 23:59:58
     * 23:59:59
     * 00:00:01
     * 00:00:00
     * 23:59:58
     */
}