package pl.bel.abstractClass;

public abstract class Flyable {
    private String modelAir;
    private int bortNumber;

    abstract public String getModelAir() {
        return modelAir;
    }

    public void setModelAir(String modelAir) {
        this.modelAir = modelAir;
    }

    public int getBortNumber() {
        return bortNumber;
    }

    public void setBortNumber(int bortNumber) {
        this.bortNumber = bortNumber;
    }
}
