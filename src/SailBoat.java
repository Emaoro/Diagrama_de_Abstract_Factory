class SailBoat implements Vehicle {
    @Override
    public void move() { System.out.println("Sailing a SailBoat"); }
}

class SpeedBoat implements Vehicle {
    @Override
    public void move() { System.out.println("Sailing a SpeedBoat"); }
}