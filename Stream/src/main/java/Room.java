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

    public void superCool() {
        conditioner.superCool();
    }

    public void customCool(Scanner scan) {
        System.out.println("set own temp");
        conditioner.customCool(scan.nextInt());
    }

    public void exit() {
        boolean working = false;
    }

    public void tempChecker() {
        int actualTemp = conditioner.getActualTemp();
        if (actualTemp < 15){
            throw new TooLowTempException("sdfasdfs");
        } else if (actualTemp > 35) {
            throw  new TooHighTempException("gsfgsrfg");
        }
        System.out.println(actualTemp);
    }

    public Room(int temp) {
        this.conditioner = new Conditioner(temp);
    }

}
