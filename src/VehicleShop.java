class VehicleShop {
    private Vehicle vehicle;

    public VehicleShop(VehicleFactory factory, String type) {
        vehicle = factory.createVehicle(type);
    }

    public void showVehicle() {
        if(vehicle != null) vehicle.move();
        else System.out.println("Vehicle type not found!");
    }
}