package builderPattern;

public abstract class CarBuilder {

    protected CarProduct car;

    public CarBuilder() {
        car = new CarProduct();
    }

    public abstract void buildPrice();
    public abstract void buildDscMotor();
    public abstract void buildYearManufactering();
    public abstract void buildModel();
    public abstract void buildFactory();

    public CarProduct getCar() {
        return car;
    }

}
