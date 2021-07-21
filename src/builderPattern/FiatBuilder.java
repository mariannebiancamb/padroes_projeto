package builderPattern;

public class FiatBuilder extends CarBuilder{

    @Override
    public void buildPrice() {
        car.price = 2550.00;
    }

    @Override
    public void buildDscMotor() {
        car.dscMotor = "Fire Flex 1.0";
    }

    @Override
    public void buildYearManufactering() {
        car.yearManufactering = 2011;
    }

    @Override
    public void buildModel() {
        car.model = "Palio";
    }

    @Override
    public void buildFactory() {
        car.factory = "Fiat";
    }
}
