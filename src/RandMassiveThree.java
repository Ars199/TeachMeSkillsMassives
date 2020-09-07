public class RandMassiveThree {
    public static void main(String[] args) {
        int[] a = new int[99];
        int i = 0;
        int c = 0;

        while (i < 99) {
            int b = (int) (Math.random() * 99);
            a[i] = b;
            i++;
        }
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");  //в строку
        }
        System.out.println("");
        for (i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                c = c + 1;
                System.out.print(a[i] + " ");
            }
        }
        System.out.println("");
        System.out.println("Count: "+ c);
    }
}
