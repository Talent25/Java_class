public class Main {
    public static void main(String[] args) {
        Car TheCar = new Car("Camry", "Toyota", 2022, 25000.00, "blue", 5);

        System.out.println("Initial state of the car: " + TheCar.toString());

        TheCar.sell(2);

        System.out.println("After selling 2 cars: ");
        System.out.println("Model: " + TheCar.getModel());
        System.out.println("Brand: " + TheCar.getBrand());
        System.out.println("Year: " + TheCar.getYear());
        System.out.println("Price: " + TheCar.getPrice());
        System.out.println("Color: " + TheCar.getColor());
        System.out.println("Quantity: " + TheCar.getQuantity());

        TheCar.setModel("Corolla");
        TheCar.setPrice(22000.00);

        System.out.println("After updating the model and price: " + TheCar.toString());
    }
}