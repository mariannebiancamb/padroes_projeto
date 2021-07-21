package builderPattern;

public class run {
    public static void main(String[] args) {
        Director concessionaria =  new Director(new FiatBuilder());

        concessionaria.builderCar();
        CarProduct car = concessionaria.buildCar();
        System.out.println("Carro: " + car.model + " / " + car.factory + "\n Ano: "
                + car.yearManufactering + "\n Motor: " + car.dscMotor + "\n preco: "
                + car.price);
    }
}
