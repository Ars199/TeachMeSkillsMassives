public class RandMassiveThree {
    public static void main(String[] args) {
        int[] a = new int[99];
        int i = 0;

        while (i < 99) {
            int b = (int) (Math.random() * 99);
            a[i] = b;
            i++;
        }
        for (i = 0; i < a.length; i++) {   //в строку
            System.out.print(a[i] + " ");

        }
       
    }
}
