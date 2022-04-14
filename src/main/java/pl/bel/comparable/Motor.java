package pl.bel.comparable;

public class Motor implements Comparable<Motor> {
    private int area;
    private int price;
    private String model;
    private boolean hasDigitalSpeedometer;

    public Motor(int area, int price, String model, boolean hasDigitalSpeedometer) {
        this.area = area;
        this.price = price;
        this.model = model;
        this.hasDigitalSpeedometer = hasDigitalSpeedometer;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Motorcycle!");
                sb.append(" , area = ").append(area);
                sb.append(", price = ").append(price);
                sb.append(", model = ").append(model);
                sb.append(", hasDigital = ").append(hasDigitalSpeedometer);
        return sb.toString();
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isHasDigitalSpeedometer() {
        return hasDigitalSpeedometer;
    }

    public void setHasDigitalSpeedometer(boolean hasDigitalSpeedometer) {
        this.hasDigitalSpeedometer = hasDigitalSpeedometer;
    }

    @Override
    public int compareTo(Motor o) {
        if (this.area == o.area) {
            return 0;
        }else if (this.area < o.area) {
            return 1;
        } else {
            return -1;
        }
    }
}
