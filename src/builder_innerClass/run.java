package builder_innerClass;

public class run {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .withPrice(1000.0)
                .withDscMotor("Fire flex")
                .withModel("Palio")
                .withFactory("Fiat")
                .withYearManufacturing(2011)
                .build();

        System.out.println(car);
    }
}
