public class NotEvenMassiveTwo {
    public static void main(String[] args) {
        int[] a = new int[10];
        int i = 0;
        int b = 3;
        while (i < 10) {
            a[i] = b;
            b = b + 2;
            i++;
        }
        for (i = 0; i < 10; i++) {   //в строку
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        for (i = 0; i < 10; i++) {   //в столбец
            System.out.println(a[i] + " ");
        }
    }
}
