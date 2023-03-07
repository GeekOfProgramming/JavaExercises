public class Man {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            int a = 0;
            for (int j = 0; j < i; j++) {
                ++a;
                System.out.println(a + j);
            }
            System.out.println("aloo");
        }
    }
}