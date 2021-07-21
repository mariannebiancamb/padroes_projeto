package builder_innerClass;

public class Car {
    public double price;
    public String dscMotor;
    public int yearManufacturing;
    public String model;
    public String factory;

    private Car(double price, String dscMotor, int yearManufacturing, String model, String factory) {
        this.price = price;
        this.dscMotor = dscMotor;
        this.yearManufacturing = yearManufacturing;
        this.model = model;
        this.factory = factory;
    }

    static class Builder {
        double price;
        String dscMotor;
        int yearManufacturing;
        String model;
        String factory;

        public Builder withPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder withDscMotor(String dscMotor) {
            this.dscMotor = dscMotor;
            return this;
        }

        public Builder withYearManufacturing(int yearManufacturing) {
            this.yearManufacturing = yearManufacturing;
            return this;
        }

        public Builder withModel(String model) {
            this.model = model;
            return this;
        }

        public Builder withFactory(String factory) {
            this.factory = factory;
            return this;
        }

        public Car build() {
            return new Car(price, dscMotor, yearManufacturing, model, factory);
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", dscMotor='" + dscMotor + '\'' +
                ", yearManufacturing=" + yearManufacturing +
                ", model='" + model + '\'' +
                ", factory='" + factory + '\'' +
                '}';
    }
}
