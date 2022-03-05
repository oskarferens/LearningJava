public class Room {

    private Conditioner conditioner;

    public void cool() {
        conditioner.cool();
    }

    public void superCool() {
        conditioner.superCool();
    }

    public void customCool() {
        conditioner.customCool(conditioner.);
    }

    public void exit() {
        boolean working = false;
    }

    public void tempChecker() {

    }

    public Conditioner getConditioner() {
        return conditioner;
    }

    public void setConditioner(Conditioner conditioner) {
        this.conditioner = conditioner;
    }

    public Room(int temp) {
        this.conditioner = new Conditioner(temp);
    }

}
