public class CountingNumbers {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        while (a <= b) {
            System.out.println(a);
            a = a + 1;
        }
    }
}
