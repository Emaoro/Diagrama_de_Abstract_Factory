class LandVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String type) {
        switch(type.toLowerCase()) {
            case "car": return new Sedan();
            case "bike": return new SportBike();
            default: return null;
        }
    }
}