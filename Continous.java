public class Continous {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("skipping at i: " + i);
                continue; // Skip the rest of the loop when i is 5
            }
            System.out.println("i: " + i);
        }
    }
}

