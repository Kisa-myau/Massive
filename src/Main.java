public class Main {
    public static void fillArray(int[] a) {

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) Math.round((Math.random() * 19) - 9);
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int [] a = new int[20];
        fillArray(a);
    }
}