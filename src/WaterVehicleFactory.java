class WaterVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String type) {
        switch(type.toLowerCase()) {
            case "boat": return new SailBoat();
            case "speedboat": return new SpeedBoat();
            default: return null;
        }
    }
}