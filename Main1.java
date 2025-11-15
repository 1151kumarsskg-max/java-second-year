class CellPhone {

    // Method to print ringing action
    void ring() {
        System.out.println("Ringing...");
    }

    // Method to print vibrating action
    void vibrate() {
        System.out.println("Vibrating...");
    }

    // Method to print calling action
    void call(String name) {
        System.out.println("Calling " + name + "...");
    }
}

public class Main1 {
    public static void main(String[] args) {

        // Creating an object of CellPhone
        CellPhone myPhone = new CellPhone();

        // Calling methods
        myPhone.ring();
        myPhone.vibrate();
        myPhone.call("Akshaya");
    }
}
