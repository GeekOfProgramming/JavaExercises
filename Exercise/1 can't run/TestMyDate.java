public class TestMyDate {

    public static void main(String[] args) {
        MyDate d1 = new MyDate(1, 5, 1952);
        System.out.println(d1);

        d1.setDay(9);
        d1.setMonth(12);
        d1.setYear(2099);
        System.out.println(d1);

        System.out.println("day= " + d1.getDay());
        System.out.println("month= " + d1.getMonth());
        System.out.println("year= " + d1.getYear());

        d1.setDate(3, 4, 2016);
        System.out.println(d1);
    }

    /*
     * 01/02/2014
     * 09/12/2099
     * Month: 12
     * Day: 9
     * Year: 2099
     * 03/04/2016
     */
}