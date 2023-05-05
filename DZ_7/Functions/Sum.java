package DZ_7.Functions;

import Java_OOP.DZ_7.Input.ConsoleInput;
import Java_OOP.DZ_7.MVP.Model;
import Java_OOP.DZ_7.MVP.PrintToConsole;
import Java_OOP.DZ_7.Objects.Numbers;
import Java_OOP.DZ_7.Operations;

public class Sum extends Operations {

    public  Sum() {

    }

    @Override
    public String result() {
        if (numberX.getImaginaryPart() == 0 && numberY.getImaginaryPart() == 0) {
            return String.format("%f", numberX.getRealPart() + numberY.getRealPart());
        } else {
            return String.format("%f + i*%f",
                    numberX.getRealPart() + numberY.getRealPart(),
                    numberX.getImaginaryPart() + numberY.getImaginaryPart());
        }
    }

    @Override
    public void setNumberX(Numbers value) {
        super.numberX = value;
    }

    @Override
    public void setNumberY(Numbers value) {
        super.numberY = value;
    }

    public static class Main {
        public static void main(String[] args) {
            Model sum = new Model(new Sum(), new PrintToConsole(), new ConsoleInput());
            sum.startCalculating();
        }
    }
}
