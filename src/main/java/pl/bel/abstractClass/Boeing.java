package pl.bel.abstractClass;

public class Boeing extends Flyable {

    @Override
    public String getModelAir() {
        return "Hello";
    }

    @Override
    public void setModelAir(String modelAir) {
        super.setModelAir(modelAir);
    }

    @Override
    public int getBortNumber() {
        return super.getBortNumber();
    }

    @Override
    public void setBortNumber(int bortNumber) {
        super.setBortNumber(bortNumber);
    }
}