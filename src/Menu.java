public class Menu {
    public static void main(String[] args) {
        VehicleFactory landFactory = new LandVehicleFactory();
        VehicleShop shop1 = new VehicleShop(landFactory, "car");
        shop1.showVehicle();

        VehicleShop shop2 = new VehicleShop(landFactory, "bike");
        shop2.showVehicle();

        VehicleFactory waterFactory = new WaterVehicleFactory();
        VehicleShop shop3 = new VehicleShop(waterFactory, "boat");
        shop3.showVehicle();

        VehicleShop shop4 = new VehicleShop(waterFactory, "speedboat");
        shop4.showVehicle();
    }
}