package builderPattern;

public class Director {
    protected CarBuilder factory;

    public Director (CarBuilder factory) {
        this.factory = factory;
    }

    public void builderCar() {
        factory.buildPrice();
        factory.buildYearManufactering();
        factory.buildDscMotor();
        factory.buildModel();
        factory.buildFactory();
    }

    public CarProduct buildCar() {
        return factory.getCar();
    }

}
