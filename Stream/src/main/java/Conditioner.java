public class Conditioner {

    int actualTemp;

    public void showActualTemp() {
        System.out.println(actualTemp);
    }

    public void cool() {
        actualTemp -= 1;
    }

    public void superCool() {
        actualTemp -= 2;
    }

    public Conditioner(int actualTemp) {
        this.actualTemp = actualTemp;
    }

    public int getActualTemp() {
        return actualTemp;
    }

    public void setActualTemp(int actualTemp) {
        this.actualTemp = actualTemp;
    }

}
