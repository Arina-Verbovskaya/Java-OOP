package DZ_7.MVP;

import Java_OOP.DZ_7.Input.ConsoleInput;
import Java_OOP.DZ_7.Functions.Sum;

public class Presenter {
    public static void startApp(){
        Model sum = new Model(new Sum(), new PrintToConsole(), new ConsoleInput());
        sum.startCalculating();
    }
}
