package DZ_6;

public class Main {
    public static void main(String[] args) {
        Controller sum = new Controller(new Sum(), new PrintToConsole(), new ConsoleInput());
        sum.startCalculating();
    }
}
