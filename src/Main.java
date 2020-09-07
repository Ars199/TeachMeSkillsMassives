public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.description();

        System.out.println(computer.getProcessor());

        computer.setProcessor("Intel");
        System.out.println(computer.getProcessor());

        computer.turnOn();

    }
}


