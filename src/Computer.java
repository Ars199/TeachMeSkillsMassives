import java.util.Scanner;

public class Computer {
    private String processor;
    private String operativka;
    private String hdd;
    private int cycles;

    void description() {     //может иметь переменные
        processor = "Athlon";
        operativka = "RAM";
        hdd = "HDD";
        cycles = 153;
        System.out.println(processor + " " + operativka + " " + hdd + " " + cycles);
    }

    String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    void turnOn() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        if (input.nextInt() == (Math.random() > 0.5 ? 1 : 0)){ //если вернет больше 0,5 то 1 если меньше то 0
            System.out.println("Комп работает ");
        }else {
            System.out.println("Не включился, пробуй ещё раз");
        }
    }


}


