import java.util.Scanner;

import Exception.TooLowTempException;
import Exception.TooHighTempException;

public class Room {

    private Conditioner conditioner;

    public String showTemp() {
        int actualTemp = conditioner.getActualTemp();
        return String.valueOf(actualTemp);
    }

    public void cool() {
        conditioner.cool();
    }
    public void abc() {
        int x = 1;
        if(x<5){
            x++;
            abc();
        }
    }

    public void superCool() {
        conditioner.superCool();
    }

    public void customCool(Scanner scan) {
        System.out.println("set own temp");
        conditioner.customCool(scan.nextInt());
    }

    public void tempChecker() {
        int actualTemp = conditioner.getActualTemp();
        if (actualTemp < 15){
            throw new TooLowTempException("Lowest possible temperature is 15°C");
        } else if (actualTemp > 35) {
            throw  new TooHighTempException("Highest possible temperature is 35°C");
        }
        System.out.println(actualTemp);
    }

    public Room(int temp) {
        this.conditioner = new Conditioner(temp);
    }
}
