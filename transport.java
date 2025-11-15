class Transport {
    void move() {
        System.out.println("Transport can move.");
    }
}

class Bus extends Transport {
    void carryPassengers() {
        System.out.println("Bus carries passengers.");
    }
}

class Truck extends Transport {
    void carryGoods() {
        System.out.println("Truck carries goods.");
    }
}

public class transport {
    public static void main(String[] args) {
        Bus b = new Bus();
        Truck t = new Truck();

        b.move();
        b.carryPassengers();

        t.move();
        t.carryGoods();

        // Use parent type reference
        Transport vehicle1 = new Bus();
        Transport vehicle2 = new Truck();

        vehicle1.move(); // Bus move
        vehicle2.move(); // Truck move
    }
}
