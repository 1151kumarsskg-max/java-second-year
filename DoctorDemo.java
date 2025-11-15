// Base class
class Doctor {
    void consultationFee() {
        System.out.println("General consultation fee: ₹500");
    }
}

// Subclass 1
class Dentist extends Doctor {
    @Override
    void consultationFee() {
        System.out.println("Dentist consultation fee: ₹800");
    }
}

// Subclass 2
class Cardiologist extends Doctor {
    @Override
    void consultationFee() {
        System.out.println("Cardiologist consultation fee: ₹1200");
    }
}

// Subclass 3
class Surgeon extends Doctor {
    @Override
    void consultationFee() {
        System.out.println("Surgeon consultation fee: ₹1500");
    }
}

// Main class
public class DoctorDemo {
    public static void main(String[] args) {
        // Use parent-type references to show polymorphism
        Doctor[] doctors = {
            new Doctor(),
            new Dentist(),
            new Cardiologist(),
            new Surgeon()
        };

        System.out.println("=== Consultation Fees ===");
        for (Doctor d : doctors) {
            d.consultationFee(); // runtime polymorphism: subclass method called if overridden
        }
    }
}
