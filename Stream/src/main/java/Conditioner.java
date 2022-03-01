public class Conditioner {

    int actualTemp;

    public void showActualTemp(int actualTemp) {
        System.out.println(actualTemp);
    }

    public void cool(int actualTemp) {
        actualTemp -= 1;
    }

    public void superCool(int actualTemp) {
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
