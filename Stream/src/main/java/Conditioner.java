public class Conditioner {
    int actualTemp;

    public void cool() {
        actualTemp -= 1;
    }

    public void superCool() {
        actualTemp -= 2;
    }

    public void customCool(int desireTemp) {
        actualTemp = desireTemp;
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
